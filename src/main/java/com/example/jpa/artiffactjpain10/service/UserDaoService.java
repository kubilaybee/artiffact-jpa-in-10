package com.example.jpa.artiffactjpain10.service;

import com.example.jpa.artiffactjpain10.entities.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDaoService {
    @PersistenceContext
    private EntityManager entityManager;

    public Long insert(UserEntity user){
        entityManager.persist(user);
        return user.getId();
    }
}
