package com.paul.test1;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		System.out.printf("Application Starting %s\n", new Date());
		SpringApplication.run(Test1Application.class, args);
	}

}
