package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
public Product saveProd(Product pro);
public Product getOne(Integer id);
public void delete(Integer id);
public List<Product> getAll();
public Product editPro(Product pro,Integer id);


}
