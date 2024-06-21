package com.example.AWS_RestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.AWS_RestAPI.repository")
public class AwsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsRestApiApplication.class, args);
	}

}
