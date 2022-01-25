package com.example.ProjectBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBoardApplication.class, args);
	}

}
