package com.jsp.SpringProject.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jsp.SpringProject.Dao.ResponseStructure;
import com.jsp.SpringProject.Dao.UserDao;
import com.jsp.SpringProject.Entity.UserEntity;

public interface UserService {
	
  List<UserEntity> allVoters();
  ResponseStructure<UserDao> save(UserDao dao);
  ResponseStructure<List<UserEntity>> getAllUser();

}
