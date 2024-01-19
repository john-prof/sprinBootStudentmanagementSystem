package com.example.demo;

import com.example.demo.DTO.StudentsDTO;
import com.example.demo.entity.Students;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Students student1 = new Students("James","Bond","bond@gmail");
		Students student2 = new Students("Julis","Yego","yego@gmail");
		Students student3 = new Students("Janet","Muli","muli@gmail");

		repository.save(student1);
		repository.save(student2);
		repository.save(student3);*/

	}
}
