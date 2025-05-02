package com.testjava.javalv1.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testjava.javalv1.entity.user.UserEntity;
import com.testjava.javalv1.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/user")
public class UserCRUDController {
    @Autowired
    private UserService userService;
   
    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity ){
        return userService.createUser(userEntity);
    }
    @GetMapping("/search")
    public UserEntity searchUSer(@RequestParam String userName, @RequestParam String userEmail){
        return userService.findByUserNameAndUserEmail(userName, userEmail);
    }

}
