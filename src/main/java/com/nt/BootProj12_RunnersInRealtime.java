package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication(exclude = JdbcTemplateAutoConfiguration.class)
public class BootProj12_RunnersInRealtime {
	
	
	
	

	public static void main(String[] args) {
		   //get  IOC container
		SpringApplication.run(BootProj12_RunnersInRealtime.class, args);
		
		
		
	}

}
