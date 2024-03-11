package com.vaccination.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination.model.Vaccination;

public interface VaccineRepo  extends JpaRepository<Vaccination, Integer>{

}
