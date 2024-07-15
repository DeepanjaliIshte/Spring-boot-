package com.springboot.program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping("/home")
	public String home()
	{
		return "Hello Home Page !";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "Hello about US !!";
	}
	
}
