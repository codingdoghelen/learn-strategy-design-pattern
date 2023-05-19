package com.demo.strategy;

import com.demo.strategy.builder.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StrategyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyApplication.class, args);

		User user1 = new User.UserBuilder("Test", "Wong")
				.age(10)
				.phone("28882888")
				.address("i am an address")
				.build();

		System.out.println(user1);

		User superman = new User.UserBuilder("Super", "Man").build();

		System.out.println(superman);

	}

}


