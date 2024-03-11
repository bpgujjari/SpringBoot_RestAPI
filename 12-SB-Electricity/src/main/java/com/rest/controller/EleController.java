package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Electricity;
import com.rest.serv.EleUserService;

@Controller
public class EleController {
	@Autowired
	private EleUserService serv;
	
	@PostMapping("/save")
	public Electricity saveUser(@RequestBody Electricity elect)
	{
		return  serv.saveUser(elect);
	}
	@GetMapping("/getOne/{id}")
	public Electricity getOneUser(@PathVariable int id)
	{
		return serv.getOneUser(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id)
	{
		serv.deleteUser(id);
	}
	
	@GetMapping("/getAll")
	public List<Electricity> getAllRecs()
	{
		return serv.getAll();
	}
	
	@PutMapping("edit/{id}")
	public Electricity editUser(@RequestBody Electricity ele,@PathVariable int id)
	{
		return serv.edit(ele, id);
	}
	@GetMapping("getByBill/{bill}/getByBill/{bill1}")

	public List<Electricity> getBybillMeth(@PathVariable double bill, @PathVariable double bill1)
	{
		return serv.getByBillUsers(bill,bill1);
	}
	
	@GetMapping("getByName/{userName}")
	public List<Electricity> getByName(@PathVariable String userName)
	{
		return serv.findByNam(userName);
	}
	
	
	
	@GetMapping("/search")
    public List<Electricity> searchUsers(@RequestParam String partialName) {
        return serv.findUsersByPartialName(partialName);
    }
}
