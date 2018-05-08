package com.job.finalprojectspring2018;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.job.finalprojectspring2018.Repositories")
@SpringBootApplication
public class FinalProjectSpring2018Application {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectSpring2018Application.class, args);
	}
}
