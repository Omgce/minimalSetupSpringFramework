package com.nifipayments;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {

	@RequestMapping("/")
	public String hello() {
		return "home";
	}

}
