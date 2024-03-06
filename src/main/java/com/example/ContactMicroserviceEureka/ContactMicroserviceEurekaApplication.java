package com.example.ContactMicroserviceEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class ContactMicroserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroserviceEurekaApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

}
