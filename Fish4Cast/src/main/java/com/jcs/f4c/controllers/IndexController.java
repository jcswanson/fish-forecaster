package com.jcs.f4c.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jcs.f4c.service.OpenWeatherApiService;


@Controller
public class IndexController {


	@GetMapping("/")
	public String getHomeView() {
		
		return "home/index";
	}

}
