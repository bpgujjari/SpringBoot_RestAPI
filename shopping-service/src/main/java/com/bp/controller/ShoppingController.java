package com.bp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/order-service/{price}")
	public String paymentInvoice(@PathVariable int price)
	{
		String url="http://PAYMENT-SERVICE/payment-service/pageNow/"+price;
		return template.getForObject(url, String.class);
	}
	

}
