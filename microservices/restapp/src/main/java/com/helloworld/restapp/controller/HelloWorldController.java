package com.helloworld.restapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String HelloWorld(){
		return "Hello World, first build oiii :)";
	}
}
