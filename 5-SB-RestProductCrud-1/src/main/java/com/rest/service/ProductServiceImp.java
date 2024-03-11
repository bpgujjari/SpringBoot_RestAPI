package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Product;
import com.rest.model.ProductCharges;
import com.rest.repo.ProductRepo;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepo repo;	
	@Override
	public Product saveProd(Product pro) {
		Product p=new Product();
		
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
		p.setProdId(pro.getProdId());
		pr.setDelivery(deli);
		pr.setGst(gs);
		
		pro.setDiscount(disc);
		pro.setProductCharges(pr);
		pro.setFinalPrize(finalp);
		
		p.setDiscount(disc);
		p.setFinalPrize(finalp);
		p.setPrice(pro.getPrice());
		p.setProCategory(pro.getProCategory());
		//p.setProdId(pro.getProdId());
		p.setProductCharges(pr);
		p.setProName(pro.getProName());
		p.setProType(pro.getProType());
		
		
		repo.save(p);
		return p;
	}
	@Override
	public Product getOne(Integer id) {
		return repo.findById(id).get();
	}
	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	@Override
	public List<Product> getAll() {

		return repo.findAll();
	}
	@Override
	public Product editPro(Product pro, Integer id) {
Product p=new Product();
		
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
		p.setProdId(pro.getProdId());
		pr.setDelivery(deli);
		pr.setGst(gs);
		
		pro.setDiscount(disc);
		pro.setProductCharges(pr);
		pro.setFinalPrize(finalp);
		
		p.setDiscount(disc);
		p.setFinalPrize(finalp);
		p.setPrice(pro.getPrice());
		p.setProCategory(pro.getProCategory());
		//p.setProdId(pro.getProdId());
		p.setProductCharges(pr);
		p.setProName(pro.getProName());
		p.setProType(pro.getProType());
		
		
		repo.save(p);
		return p;
	}

}
