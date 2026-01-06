package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
	 log.info("MY log info is working" );
	 log.warn("MY log warn is working");
	 log.error("MY log error is working");
	 log.info("API is successful...." );
		return "just for testing..";
	}

}
