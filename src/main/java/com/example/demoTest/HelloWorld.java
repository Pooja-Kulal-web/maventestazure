package com.example.demoTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	@GetMapping("/")
	public String sayHello() {
		return "HelloWorld!";
	}
}
