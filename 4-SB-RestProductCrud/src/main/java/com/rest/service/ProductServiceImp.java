package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Product;
import com.rest.entity.ProductCharges;
import com.rest.repo.ChargesRepo;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepo repo;
	@Autowired
	private ChargesRepo rp;
	
	@Override
	public Product saveProd(Product pro) {
		double disc=0.0,gs=0.0,deli=0.0,finalp=0.0;
		
		
		if(pro.getProCategory().equalsIgnoreCase("electronics"))
		{
			
			disc=(pro.getPrice()*15)/100;
			gs=(pro.getPrice()*18)/100;
			deli=350;
		}
		
		else if(pro.getProCategory().equalsIgnoreCase("home Appliances"))
		{
			
			disc=(pro.getPrice()*22)/100;
			gs=(pro.getPrice()*24)/100;
			deli=800;
		}
		
		else if(pro.getProCategory().equalsIgnoreCase("clothing"))
		{
			
			disc=(pro.getPrice()*40)/100;
			gs=(pro.getPrice()*12)/100;
			deli=0;
		}
		else if(pro.getProCategory().equalsIgnoreCase("furniture"))
		{
			
			disc=(pro.getPrice()*10)/100;
			gs=(pro.getPrice()*18)/100;
			deli=300;
		}
		
		finalp=pro.getPrice()-disc+gs+deli;
		
		ProductCharges pr=new ProductCharges();
		pr.setDelivey(deli);
		pr.setGst(gs);
		
		rp.save(pr);
		pro.setDiscount(disc);
		pro.setProductCharges(pr);
		pro.setFinalPrize(finalp);
		repo.save(pro);
		return pro;
	}

}
