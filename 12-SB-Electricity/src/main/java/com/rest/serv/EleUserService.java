package com.rest.serv;

import java.util.List;

import com.rest.entity.Electricity;

public interface EleUserService {
	public Electricity saveUser(Electricity ele);
	public Electricity getOneUser(Integer id);
	public void deleteUser(Integer id);
	public List<Electricity> getAll();
	public Electricity edit(Electricity e,Integer id);
	public List<Electricity> getByBillUsers(double bill,double bill1);
	public List<Electricity> findByNam(String userName);
	public List<Electricity> findUsersByPartialName(String partialName);
}