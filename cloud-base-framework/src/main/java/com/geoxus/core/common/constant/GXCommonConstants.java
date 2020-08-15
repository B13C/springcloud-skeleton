package com.geoxus.core.common.constant;

import com.geoxus.core.common.annotation.GXFieldCommentAnnotation;

public class GXCommonConstants {
    @GXFieldCommentAnnotation(zh = "手机验证码标识")
    public static final int SMS_VERIFY = 1;

    @GXFieldCommentAnnotation(zh = "图形验证码标识")
    public static final int CAPTCHA_VERIFY = 2;

    @GXFieldCommentAnnotation(zh = "电子邮箱验证码标识")
    public static final int EMAIL_VERIFY = 3;

    @GXFieldCommentAnnotation(zh = "标识核心模型主键名字")
    public static final String CORE_MODEL_PRIMARY_NAME = "core_model_id";

    @GXFieldCommentAnnotation(zh = "默认当前分页")
    public static final int DEFAULT_CURRENT_PAGE = 1;

    @GXFieldCommentAnnotation(zh = "默认每页的大小")
    public static final int DEFAULT_PAGE_SIZE = 20;

    @GXFieldCommentAnnotation(zh = "默认数据")
    public static final String DEFAULT_DATA = "控制器默认方法";

    @GXFieldCommentAnnotation(zh = "验证数字的正则表达式")
    public static final String DIGITAL_REGULAR_EXPRESSION = "^[+-]?(0|([1-9]\\d*))(\\.\\d+)?$";

    @GXFieldCommentAnnotation(zh = "手机号码加密的KEY")
    public static final String PHONE_ENCRYPT_KEY = "B78D32BTR1CHEN15AC1F19C46A9B533986";

    @GXFieldCommentAnnotation(zh = "永久存储缓存的KEY")
    public static final String PERMANENT_CACHE_MAP_KEY = "permanent_cache_map";

    @GXFieldCommentAnnotation(zh = "状态字段的名字")
    public static final String STATUS_FIELD_NAME = "status";

    private GXCommonConstants() {
    }
}
