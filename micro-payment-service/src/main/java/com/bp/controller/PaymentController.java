package com.bp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bp.entity.MicroPayment;
import com.bp.repo.PaymentRepo;

@RestController
public class PaymentController {
	@Autowired
	private PaymentRepo repo;
	
	@PostMapping("/save")
	public String savePayment(@RequestBody MicroPayment payment)
	{
		repo.save(payment);
		return "success";
	}
}
