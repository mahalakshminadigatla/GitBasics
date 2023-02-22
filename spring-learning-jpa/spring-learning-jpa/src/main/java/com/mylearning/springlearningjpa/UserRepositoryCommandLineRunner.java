package com.mylearning.springlearningjpa;

import com.mylearning.springlearningjpa.entity.User;
import com.mylearning.springlearningjpa.service.UserRepository;
import com.mylearning.springlearningjpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepo;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("Harshi","Admin");
        userRepo.save(user);
        log.info("New User got created:" + user);
        Optional<User> UserWithIdOne = userRepo.findById(1L);
        log.info("User with Id 1:" + UserWithIdOne);
        List<User> users = userRepo.findAll();
        log.info("Users in DB:" + users);
    }
}
