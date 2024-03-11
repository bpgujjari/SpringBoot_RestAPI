package com.bp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.model.MicroProduct;

public interface ProductRepo  extends JpaRepository<MicroProduct, Integer>{

}
