package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.first.Service.ReportDaoService;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class AutowiringPracticeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =SpringApplication.run(AutowiringPracticeApplication.class, args);
		ReportDaoService rds = context.getBean(ReportDaoService.class);
		
		rds.database();

	}

}
