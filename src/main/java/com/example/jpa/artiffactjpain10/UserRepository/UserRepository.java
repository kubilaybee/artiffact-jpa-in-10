package com.example.jpa.artiffactjpain10.UserRepository;

import com.example.jpa.artiffactjpain10.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
