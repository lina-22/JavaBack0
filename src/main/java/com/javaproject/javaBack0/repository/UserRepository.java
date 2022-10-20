package com.javaproject.javaBack0.repository;

import com.javaproject.javaBack0.model.UserModel;
import com.javaproject.javaBack0.request.UserModelRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface UserRepository extends JpaRepository<UserModel, Long>{


    public boolean existsByEmail(String email);

    public UserModel findByEmail(String email);
}
