package com.naturalprogrammer.spring5tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackageClasses = {NpSpring5TutorialApplication.class, })
public class NpSpring5TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpSpring5TutorialApplication.class, args);
	}

}
