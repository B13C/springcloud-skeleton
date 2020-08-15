package com.geoxus.core.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface GXRequestBodyToEntityAnnotation {
    String value() default "";

    Class<?>[] groups() default {};

    String[] jsonFields() default {"ext"};

    boolean fillJSONField() default true;

    boolean validateEntity() default true;

    String phoneFieldName() default "phone";

    boolean isValidatePhone() default false;

    boolean encryptedPhone() default true;

    boolean validateCoreModelId() default true;

    String primaryKey() default "id";
}
