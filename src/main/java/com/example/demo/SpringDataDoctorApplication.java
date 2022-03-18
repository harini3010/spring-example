package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

@SpringBootApplication
public class SpringDataDoctorApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataDoctorApplication.class, args);
	
		//Doctor list = ctx.getBean(Doctor.class);
		
		DoctorService service = ctx.getBean(DoctorService.class);
		
		//service.findAll().forEach(System.out::println);
		
		service.findByCity("chennai").forEach(System.out::println);
	}

}

