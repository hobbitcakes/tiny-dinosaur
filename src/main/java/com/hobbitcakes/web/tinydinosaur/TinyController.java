package com.hobbitcakes.web.tinydinosaur;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

@RestController
public class TinyController {

	@RequestMapping("/")
        public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/version", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public String version() {
		ApplicationVersion version = new ApplicationVersion("0.0.1", "TinyDino");
		Gson gson = new Gson();
		String json = gson.toJson(version);
		return json;
		}
}
