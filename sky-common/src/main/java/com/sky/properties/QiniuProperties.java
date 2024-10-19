package com.sky.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "sky.qiniu")
public class QiniuProperties {
    private String accessKey;

    private String secretKey;

    private String Bucket;

    private String url;

}
