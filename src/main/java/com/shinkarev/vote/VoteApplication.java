package com.shinkarev.vote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class VoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
	}
}
