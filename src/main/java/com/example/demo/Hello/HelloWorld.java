package com.example.demo.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User.UserDetails;

@RestController
public class HelloWorld {
	
	@GetMapping("/hello")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping("/User")
	public UserDetails helloworldbean() {
		return new UserDetails("Chenna","Reddy","Hyd");
	}

}
