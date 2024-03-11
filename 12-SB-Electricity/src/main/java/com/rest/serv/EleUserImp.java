package com.rest.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Electricity;
import com.rest.repo.EleUserRepo;
@Service
public class EleUserImp  implements EleUserService{
	@Autowired 
	private EleUserRepo repo;

	@Override
	public Electricity saveUser(Electricity ele) {
		
		ele.setMonthlyUnits(ele.getCurrentUnits()-ele.getPreviousUnits());
		
		if(ele.getMonthlyUnits()<300)
		{
			ele.setPerUnit(1.75);
			ele.setBill(ele.getMonthlyUnits()*ele.getPerUnit());
		}
		else if(ele.getMonthlyUnits()>300)
		{
			ele.setPerUnit(1.75);
			ele.setPerUnitAbove300(3.25);
			
			
			double extra=ele.getMonthlyUnits()-300;
			double bill=extra*ele.getPerUnitAbove300();
			
			double before300=ele.getMonthlyUnits()-extra;
			double bill300 = before300*ele.getPerUnit();
			
			ele.setBill(bill+bill300);
			
			
		}
		
		repo.save(ele);
		
		
		return ele;
	}

	@Override
	public Electricity getOneUser(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteUser(Integer id) {

		repo.deleteById(id);
	}

	@Override
	public List<Electricity> getAll() {
		return repo.findAll();
	}

	@Override
	public Electricity edit(Electricity ele, Integer id) {
ele.setMonthlyUnits(ele.getCurrentUnits()-ele.getPreviousUnits());
		
		if(ele.getMonthlyUnits()<300)
		{
			ele.setPerUnit(1.75);
			ele.setBill(ele.getMonthlyUnits()*ele.getPerUnit());
		}
		else if(ele.getMonthlyUnits()>300)
		{
			ele.setPerUnit(1.75);
			ele.setPerUnitAbove300(3.25);
			
			
			double extra=ele.getMonthlyUnits()-300;
			double bill=extra*ele.getPerUnitAbove300();
			
			double before300=ele.getMonthlyUnits()-extra;
			double bill300 = before300*ele.getPerUnit();
			
			ele.setBill(bill+bill300);
			
			
		}
		
		repo.save(ele);
		
		
		return ele;
	}
	
	
	public List<Electricity>getByBillUsers(double bill,double bill1){
		return repo.findByBill(bill,bill1);
	}

	@Override
	public List<Electricity> findByNam(String userName) {

		
			List<Electricity>list1=repo.findAll();
			List<Electricity>list2=null;
			
			for(Electricity e :list1)
			{
				if(e.getUserName().contains(userName))
				{
					list2.add(e);
				}
			}
			 
			
		return list2;
	}
	
	
	
	
	
	
	public List<Electricity> findUsersByPartialName(String partialName) {
        return repo.findByUserNameContaining(partialName);
    }
	
	
	
	
	
	}


