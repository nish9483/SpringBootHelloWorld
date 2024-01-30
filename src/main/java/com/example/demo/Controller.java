package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Controller {
	
		  @Autowired
			StudentRepo repo;
			
			@PostMapping("/student")
			public ResponseEntity<Student>savedata(@RequestBody Student st)
			{
				return new ResponseEntity<>(repo.save(st),HttpStatus.CREATED);
			}
			
}
