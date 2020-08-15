package com.geoxus.core.ueditor.upload;


import com.geoxus.core.ueditor.define.GXState;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 上传接口，自定义上传需实现此方法
 */
public interface GXEditorUploader {
    /**
     * 上传文件方法
     *
     * @param request 上传请求
     * @return 文件路径
     */
    GXState binaryUpload(HttpServletRequest request, Map<String, Object> conf);

    /**
     * Base64上传文件方法 百度编辑器中的涂鸦
     *
     * @param request 上传请求
     * @return 文件路径
     */
    GXState base64Upload(HttpServletRequest request, Map<String, Object> conf);

    /**
     * 获取图片列表
     *
     * @param index 位置
     * @return 文件列表
     */
    GXState listImage(int index, Map<String, Object> conf);

    /**
     * 获取文件列表
     *
     * @param index 位置
     * @return 文件列表
     */
    GXState listFile(int index, Map<String, Object> conf);

    /**
     * 抓取远程图片
     *
     * @param list 图片列表
     * @return 文件列表
     */
    GXState imageHunter(String[] list, Map<String, Object> conf);
}
