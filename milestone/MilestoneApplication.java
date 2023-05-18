package com.example.milestone;

import com.example.milestone.Entities.User;
import com.example.milestone.Respiratory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class MilestoneApplication {


	@Autowired
	private UserRepository userrepository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(
				new User(101,"sachin","sachin1","sachin@gmail.com"),
				new User(102,"sachin","sachin2","sachin@gmail.com")

		).collect(Collectors.toList());
		userrepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(MilestoneApplication.class, args);
	}

}
