package com.example.jpa.artiffactjpain10.UserRepository;

import com.example.jpa.artiffactjpain10.entities.UserEntity;
import com.example.jpa.artiffactjpain10.service.UserDaoService;
import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);
    @Override
    public void run(String... args) throws Exception {
        UserEntity user = new UserEntity("Name","Role");
        userRepository.save(user);
        log.info("New User Created!! -> "+user);

        Optional<UserEntity> userWithId = userRepository.findById(1L);
        log.info("User is Retrived!! -> "+ userWithId);

        List<UserEntity> users = userRepository.findAll();
        log.info("All Users!! -> "+ users);
    }
}
