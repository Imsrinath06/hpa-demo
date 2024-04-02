package com.hpa.service;

import com.hpa.dto.User;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.hpa.util.DataGenerator.*;


@Service
public class UserService {

    public User getUser(){
        System.out.println("execution of get user started");
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setUserName(generateRandomName());
        String name = user.getUserName().replaceAll(" ", "").toLowerCase();
        user.setEmail(name + "@" + generateRandomEmail());
        user.setMobile(generateRandomMobileNumber());
        return user;
    }
}
