package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/home")
	public String getHomePage()
	{
		return "homepage";
	}
	
	@GetMapping("/welcome")
	public String getWelcomePage()
	{
		return "welcomepage";
	}
	
	@GetMapping("/admin")
	public String getAdminPage()
	{
		return "adminpage";
	}
	
	@GetMapping("/emp")
	public String getEmpPage()
	{
		return "emp";
	}
	
	@GetMapping("/mgr")
	public String getManagerPage()
	{
		return "mgrpage";
	}
	
	@GetMapping("/common")
	public String getCommonPage()
	{
		return "common";
	}
	
	@GetMapping("/logout")
	public String getLogoutPage()
	{
		return "logout";
	}
	
	
}
