package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sts.dao.UserRepository;
import com.sts.model.User;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProjectApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		
		user.setName("Anshul");
		user.setCity("Delhi");
		user.setStatus("Java");
		
		User savedUser = userRepository.save(user);
		System.out.println(savedUser);
		System.out.println("So the user has been saved");
	}
}
