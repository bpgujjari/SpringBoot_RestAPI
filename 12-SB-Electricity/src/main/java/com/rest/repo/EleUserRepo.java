package com.rest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.entity.Electricity;
@Repository
public interface EleUserRepo  extends JpaRepository<Electricity , Integer>{
	
	@Query("select e from Electricity e WHERE e.bill BETWEEN  ?1 AND ?2 ")
	public List<Electricity> findByBill(double bill,double bill1);
	

	
    List<Electricity> findByUserNameContaining(String partialName);

	
	
}
