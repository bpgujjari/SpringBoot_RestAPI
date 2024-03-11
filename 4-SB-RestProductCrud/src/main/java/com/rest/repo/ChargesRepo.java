package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.ProductCharges;
@Repository
public interface ChargesRepo extends JpaRepository<ProductCharges, Integer> {

}
