package com.brunomello.testedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
		"com.brunomello.testedata.server"
})
@EnableJpaRepositories(basePackages = {
		"com.brunomello.testedata.repository"
		
})
public class TestedataApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestedataApplication.class, args);
	}

}
