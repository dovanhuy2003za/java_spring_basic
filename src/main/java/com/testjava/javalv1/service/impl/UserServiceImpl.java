package com.testjava.javalv1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testjava.javalv1.entity.user.UserEntity;
import com.testjava.javalv1.respository.UserRespository;
import com.testjava.javalv1.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
       return userRespository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRespository.findAll();
    }

    @Override
    public UserEntity findByUserNameAndUserEmail(String userName, String userEmail) {
        
        return userRespository.findByUserNameAndUserEmail(userName, userEmail);
    }

    
}
