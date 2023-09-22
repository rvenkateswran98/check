package com.onesoft.apps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(value = "get")
	public String getStering() {
		return "---->> Hi Hello Vanakkam Makkaley <<----";
	}

}
