package com.cos.newapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ViewController {

	@GetMapping("/home")
	public String home() {
		System.out.println("호출돼드냐?");
		return "home";
	}
	@GetMapping("/post")
	public String post() {
		System.out.println("호출돼드냐?");
		return "post";
	}
}
