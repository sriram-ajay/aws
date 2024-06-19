package com.api.serverless.lambdamicro1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.api.serverless.lambdamicro1.dto.MessageDto;

@RestController
public class HelloController {

	@RequestMapping(path = "/hi")
	public ResponseEntity<MessageDto> hi() {

		return ResponseEntity.ok(new MessageDto("hi"));
	}

	@RequestMapping(path = "/hello")
	public ResponseEntity<MessageDto> hello() {

		return ResponseEntity.ok(new MessageDto("hello"));
	}
}
