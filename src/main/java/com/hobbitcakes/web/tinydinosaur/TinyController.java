package com.hobbitcakes.web.tinydinosaur;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TinyController {

	@RequestMapping("/")
        public String index() {
		return "Greetings from Spring Boot!";
	}
}
