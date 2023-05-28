package com.jsp.SpringProject.Rpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringProject.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{

}
