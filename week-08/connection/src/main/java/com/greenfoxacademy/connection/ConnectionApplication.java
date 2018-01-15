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
		todoRepository.save(new Todo("Start the day", true, true));
		todoRepository.save(new Todo("Make the beds", true, true));
		todoRepository.save(new Todo("Do the washing up", true, false));
		todoRepository.save(new Todo("Tidy up"));
		todoRepository.save(new Todo("Trow out the trash", true, true));
		todoRepository.save(new Todo("Broom", false, true));
		todoRepository.save(new Todo("Mop"));
		todoRepository.save(new Todo("Vacuuming"));
	}
}
