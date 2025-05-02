package com.testjava.javalv1.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.testjava.javalv1.entity.user.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    List<UserEntity> getAllUsers();
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
    
    //pageable
    Page<UserEntity> findByUserName(Pageable pageable, String userName);
    Page<UserEntity> findAll(Pageable pageable);
}
