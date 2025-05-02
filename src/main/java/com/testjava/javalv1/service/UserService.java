package com.testjava.javalv1.service;

import java.util.List;

import com.testjava.javalv1.entity.user.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    List<UserEntity> getAllUsers();
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
}
