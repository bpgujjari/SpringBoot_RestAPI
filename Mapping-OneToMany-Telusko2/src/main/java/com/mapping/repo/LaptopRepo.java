package com.mapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entity.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

}
