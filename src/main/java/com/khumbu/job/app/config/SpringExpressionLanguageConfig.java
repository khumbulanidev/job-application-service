package com.khumbu.job.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/***
 * This is an example of using Spring expression Language
 */

@Configuration
@PropertySource("classpath:/dev.properties")
@Profile("dev")
public class SpringExpressionLanguageConfig {

    private Logger logger = LoggerFactory.getLogger(SpringExpressionLanguageConfig.class);
    //properties can be accessed fromthe environment
    @Bean
    public DataSource dataSource(@Value("#{environment[spring.datasource.driver-class-name]}" ) String driver,
                                 @Value("#{environment[spring.datasource.url]}") String url,
                                 @Value("#{environment[spring.datasource.username]}") String user,
                                 @Value("#{environment[spring.datasource.password]}") String password
    ) {
    logger.info("Driver : " +driver);
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;

    }

}
