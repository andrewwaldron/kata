package com.kata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//   Build a simple poll application. The following are the functionality priorities, in order:
//		1. Ability to create a poll
//		2. Ability to add choices to the poll
//		3. Ability for visitors to see and vote on the poll options
//		4. Ability to view the number of votes on each option in a poll
//		5. Ability to edit a poll and its options

@SpringBootApplication
public class KataApplication {

	public static void main(String[] args) {
		SpringApplication.run(KataApplication.class, args);
	}

}
