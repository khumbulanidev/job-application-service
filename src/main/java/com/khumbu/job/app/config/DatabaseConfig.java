package com.khumbu.job.app.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


//@Configuration
//@Profile("prod")
//@PropertySource("classpath:/example.properties")
public class DatabaseConfig {
	
	
	@Bean
	
	public DataSource dataSource(@Value("${spring.datasource.driver-class-name}" ) String driver,
			@Value("${spring.datasource.url}") String url,
			@Value("${spring.datasource.username}") String user,
			@Value("${spring.datasource.password}") String password
			) {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driver);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
		return dataSource;
		 
	}
	
	

}
