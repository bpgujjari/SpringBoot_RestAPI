package com.image.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Image;

public interface ImageRepo extends JpaRepository<Image, Integer> {

}
