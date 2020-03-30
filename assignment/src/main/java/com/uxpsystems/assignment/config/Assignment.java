package com.uxpsystems.assignment.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring boot main application class
 * 
 * @author Hitesh
 *
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = "com.uxpsystems.assignment")
public class Assignment {

	public static void main(String[] args) {
		SpringApplication.run(Assignment.class, args);
	}

}
