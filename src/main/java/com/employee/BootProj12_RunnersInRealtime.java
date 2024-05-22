package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude = JdbcTemplateAutoConfiguration.class)
public class BootProj12_RunnersInRealtime {

    public static void main(String[] args) {
        //get  IOC container
        SpringApplication.run(BootProj12_RunnersInRealtime.class, args);


    }

}
