package com.geoxus.shiro.entities;

import com.geoxus.core.common.annotation.GXFieldCommentAnnotation;
import com.geoxus.core.common.entity.GXBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class GXSAdminEntity extends GXBaseEntity implements Serializable {
    @GXFieldCommentAnnotation(zh = "状态")
    private int status;

    @GXFieldCommentAnnotation(zh = "是否超级管理员")
    private int isSuperAdmin;
}
