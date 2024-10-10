package com.echoplex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.echoplex.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);

}
