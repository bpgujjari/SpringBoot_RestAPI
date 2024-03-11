package com.bp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.entity.MicroCustomer;

public interface CustemerRepo extends JpaRepository<MicroCustomer, Integer> {

}
