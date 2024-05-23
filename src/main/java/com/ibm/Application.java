package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = { "com.ibm.*"})
public class Application {
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
	
}
