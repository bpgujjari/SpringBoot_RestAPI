package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
}
