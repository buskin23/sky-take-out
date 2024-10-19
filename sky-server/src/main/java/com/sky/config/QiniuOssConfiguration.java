package com.sky.config;

import com.sky.properties.QiniuProperties;
import com.sky.utils.QiniuUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j
@Configuration
public class QiniuOssConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public QiniuUtil qiniuUtil(QiniuProperties qiniuProperties){
        log.info("开始创建七牛云文件上传工具类对象：{}",qiniuProperties);
        return new QiniuUtil(qiniuProperties.getAccessKey(),
                qiniuProperties.getSecretKey(),
                qiniuProperties.getBucket(),
                qiniuProperties.getUrl());
    }
}
