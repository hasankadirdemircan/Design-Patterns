package com.hkdemircan.demo.repository;

import com.hkdemircan.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
