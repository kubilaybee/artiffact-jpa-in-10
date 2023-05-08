package com.example.jpa.artiffactjpain10.service;

import com.example.jpa.artiffactjpain10.entities.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserDaoService userDaoService;

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        UserEntity user = new UserEntity("Name","Role");
        userDaoService.insert(user);
        log.info("New User Created!! -> "+user);
    }
}
