package com.khumbu.job.app;

import com.khumbu.job.app.config.SpringExpressionLanguageConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class JobApplicationSystemApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringExpressionLanguageConfig.class);
	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(JobApplicationSystemApplication.class, args);

	}

}
