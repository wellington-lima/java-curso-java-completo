package com.sophysistemas.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sophysistemas.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
