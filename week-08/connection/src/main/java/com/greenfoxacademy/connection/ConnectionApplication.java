package com.greenfoxacademy.connection;

import com.greenfoxacademy.connection.models.Todo;
import com.greenfoxacademy.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConnectionApplication.class, args);
	}

	@Autowired
	TodoRepository todoRepository;

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Start the day"));
		todoRepository.save(new Todo("Finish H2 workshop1"));
		todoRepository.save(new Todo("Finish JPA workshop2"));
		todoRepository.save(new Todo("Create a CRUD project"));
	}
}
