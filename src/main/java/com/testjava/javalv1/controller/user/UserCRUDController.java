package com.testjava.javalv1.controller.user;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    @GetMapping("/all")
    public Page<UserEntity> getAllUser(
        @RequestParam int page,
        @RequestParam int size, 
        @RequestParam(defaultValue = "id") String sort,
        @RequestParam(defaultValue = "desc") String direction
    ){
        Sort sortBy = Sort.by(direction.equalsIgnoreCase("desc") ? Sort.Direction.ASC : Sort.Direction.DESC, sort);
        Pageable pageable =PageRequest.of(page, size, sortBy);
        return userService.findAll(pageable);
    }

    @GetMapping("/searchByName")
    public Page<UserEntity> searchByName(@RequestParam String userName,
        @RequestParam int page,
        @RequestParam int size, 
        @RequestParam(defaultValue = "id") String sort,
        @RequestParam(defaultValue = "desc") String direction
    ){
        Sort sortBy = Sort.by(direction.equalsIgnoreCase("desc") ? Sort.Direction.ASC : Sort.Direction.DESC, sort);
        Pageable pageable =PageRequest.of(page, size, sortBy);
        return userService.findByUserName(pageable, userName);
    }    
}
