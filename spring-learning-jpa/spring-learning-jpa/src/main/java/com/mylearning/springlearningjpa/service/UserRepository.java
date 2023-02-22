package com.mylearning.springlearningjpa.service;

import com.mylearning.springlearningjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
