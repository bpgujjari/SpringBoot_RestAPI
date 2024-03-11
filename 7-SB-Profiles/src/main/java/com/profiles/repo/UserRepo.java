package com.profiles.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profiles.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
