package net.tanmay.springboot2.springboot2junit5.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}