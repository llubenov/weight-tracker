package com.weight.project.weighttracker;

import com.weight.project.weighttracker.entity.Skill;
import com.weight.project.weighttracker.entity.User;
import com.weight.project.weighttracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class WeightTrackerApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WeightTrackerApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		User user= new User("Ashish", null);
		user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}
}
