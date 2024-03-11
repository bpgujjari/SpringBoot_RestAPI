package com.vaccination.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination.model.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

}
