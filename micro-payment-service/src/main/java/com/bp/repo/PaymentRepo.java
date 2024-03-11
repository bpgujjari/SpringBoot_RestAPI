package com.bp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bp.entity.MicroPayment;

public interface PaymentRepo extends JpaRepository<MicroPayment, Integer> {

}
