package com.solu.library.repository;

import com.solu.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
}