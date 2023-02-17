package com.mylearning.springlearningjpa;

import com.mylearning.springlearningjpa.entity.User;
import com.mylearning.springlearningjpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class UserServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(UserServiceCommandLineRunner.class);

    @Autowired
    private UserService userService;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("Maha","Admin");
        long insert = userService.insert(user);
        log.info("New User got created:" + user);
    }
}
