package com.hpa.controller;

import com.hpa.dto.User;
import com.hpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/service")
public class UserServiceController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(){
      return userService.getUser();
    }
}
