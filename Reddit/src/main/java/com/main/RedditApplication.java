package com.main;

import com.main.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class RedditApplication {

	public static void main(String[] args) {
		new File(UserController.uploadDirectory).mkdir();
		SpringApplication.run(RedditApplication.class, args);
	}

}
