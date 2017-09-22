package com.horasphere.access.application.config;

import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DatasourceConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    
    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException
    {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setInitialPoolSize(6);
        dataSource.setMinPoolSize(6);
        dataSource.setMaxPoolSize(20);
        dataSource.setAcquireIncrement(3);
        dataSource.setMaxStatements(0);

        dataSource.setAcquireRetryAttempts(30);
        dataSource.setAcquireRetryDelay(1000);
        dataSource.setBreakAfterAcquireFailure(false);

        dataSource.setMaxIdleTime(14400);
        dataSource.setMaxConnectionAge(14400);
        
        dataSource.setCheckoutTimeout(5000);
        dataSource.setIdleConnectionTestPeriod(300);
        dataSource.setTestConnectionOnCheckout(true);
        dataSource.setTestConnectionOnCheckin(false);

        dataSource.setJdbcUrl(url);
        dataSource.setPassword(password);
        dataSource.setUser(username);
        dataSource.setDriverClass(driverClassName);

        return dataSource;
    }
	
}
