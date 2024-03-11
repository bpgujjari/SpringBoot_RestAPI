package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/home")
	public String home()
	{
		return "<h1>WELCOME TO SPRING SECURITY</h1>";
	}
	@GetMapping("/balance")
	public String balance()
	{
		String str=	"YOUR ACCOUNT BALANCE IS:....10000.00";
		
		return str;
	}
	
	@GetMapping("/statement")
	public String strtemnt()
	{
		String str="YOUR STATEMENT SENT TO YOUR MAIL ID";
		return str;
	}
	@GetMapping("/loan")
	public String loan()
	{
		String str="YOUR LOAN AMOUNT IS 8988.89";
		return str;
	}
	

	@GetMapping("/contact")
	public String contact()
	{
		String str="CONTACT 78787889";
		return str;
	}
	
	
	
}
