package com.buimanhthanh.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("")
	public String homePage() {
		return "index";
	}
	@GetMapping("/trang-chu")
	public String homePage1() {
		return "index";
	}
}
