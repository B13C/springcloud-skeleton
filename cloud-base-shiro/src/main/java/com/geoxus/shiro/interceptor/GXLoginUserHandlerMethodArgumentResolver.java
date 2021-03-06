package com.geoxus.shiro.interceptor;

import cn.hutool.core.lang.Dict;
import com.geoxus.core.common.oauth.GXTokenManager;
import com.geoxus.core.common.util.GXSpringContextUtils;
import com.geoxus.shiro.annotation.GXLoginUserAnnotation;
import com.geoxus.shiro.entities.GXUUserEntity;
import com.geoxus.shiro.services.GXUUserService;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Objects;

/**
 * 有@LoginUserAnnotation注解的方法参数，注入当前登录用户
 */
@Component
public class GXLoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().getSuperclass().isAssignableFrom(GXUUserEntity.class) && parameter.hasParameterAnnotation(GXLoginUserAnnotation.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {
        //获取用户ID
        Object object = request.getAttribute(GXTokenManager.USER_ID, RequestAttributes.SCOPE_REQUEST);
        if (object == null) {
            final String header = request.getHeader(GXTokenManager.USER_TOKEN);
            if (null == header) {
                return null;
            }
            final Dict tokenData = GXTokenManager.decodeUserToken(header);
            object = tokenData.getObj(GXTokenManager.USER_ID);
            if (null == object) {
                return null;
            }
        }
        //获取用户信息
        return Objects.requireNonNull(GXSpringContextUtils.getBean(GXUUserService.class)).getById((Long) object);
    }
}
