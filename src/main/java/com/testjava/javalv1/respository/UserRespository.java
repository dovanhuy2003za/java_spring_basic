package com.testjava.javalv1.respository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.testjava.javalv1.entity.user.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRespository extends JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
    //use pageable
    Page<UserEntity> findByUserName(String nane, Pageable pageable);

    Page<UserEntity> findAll(Pageable pageable);
    
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    //where like %?%
    List<UserEntity> findByUserNameContaining(String userName);

    

    //jpql 
    @Query("Select u from UserEntity u WHERE u.userName = ?1 AND u.userEmail=?2 ")
    List<UserEntity> getSUserEntities(@Param("userName") String userName, @Param("userEmail") String userEmail);
    
    //update
    @Query("update UserEntity u set u.userName=:userName")
    @Modifying
    @Transactional
    int updateUserName(@Param("userName") String userName);
    
}
