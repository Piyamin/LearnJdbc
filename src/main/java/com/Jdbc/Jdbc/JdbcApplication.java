package com.Jdbc.Jdbc;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
// @CrossOrigin 
// @AutoConfigurationPackage
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// @Configuration
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

}
