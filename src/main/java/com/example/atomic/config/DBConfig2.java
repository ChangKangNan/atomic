package com.example.atomic.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Data
/**
 * 将application.properties配置文件中配置自动封装到实体类字段中
 * @author Administrator
 */
@ConfigurationProperties(prefix = "spring.datasource.test2") // 注意这个前缀要和application.properties文件的前缀一样
@Component
public class DBConfig2 {

    private String url;
    private String username;
    private String password;
    private int minPoolSize;
    private int maxPoolSize;
    private int maxLifetime;
    private int borrowConnectionTimeout;
    private int loginTimeout;
    private int maintenanceInterval;
    private int maxIdleTime;
    private String testQuery;
}

