package com.chad.springsecurityjwtdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.chad.springsecurityjwtdemo.mapper")
@SpringBootApplication
public class SpringSecurityJwtDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtDemoApplication.class, args);
	}
	
}
