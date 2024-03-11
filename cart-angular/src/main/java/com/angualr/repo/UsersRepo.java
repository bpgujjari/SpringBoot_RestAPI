package com.angualr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.angualr.entity.User;

@Repository
public interface UsersRepo extends JpaRepository<User,Integer> {
	
	 @Query("SELECT u FROM User u WHERE u.name = ?1")
	   public User findByName(String name);

}
