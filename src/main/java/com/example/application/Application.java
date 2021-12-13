package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController


public class Application {
@Autowired
ApplicationRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

@PostMapping("/applications")

public ResponseEntity<String> addApplication (@RequestBody Application applications) {
repository.save(Application);
return ResponseEntity.status(HttpStatus.CREATED).body("name added");
}
}
