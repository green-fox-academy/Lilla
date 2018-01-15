package com.greenfoxacademy.listing;

import com.greenfoxacademy.listing.models.Todo;
import com.greenfoxacademy.listing.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ListingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ListingApplication.class, args);
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
