package com.geoxus.core.common.config;

import com.geoxus.core.common.factory.GXYamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "upload")
@PropertySource(value = {"classpath:/ymls/${spring.profiles.active}/upload.yml"}, factory = GXYamlPropertySourceFactory.class, encoding = "utf-8")
public class GXUploadConfig {
    private String depositPath;

    private String returnPath;
}
