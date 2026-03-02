package com.jse.module06.lab02.repository;

import com.jse.module06.lab02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
