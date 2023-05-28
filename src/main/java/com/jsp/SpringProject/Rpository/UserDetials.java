package com.jsp.SpringProject.Rpository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.jsp.SpringProject.Dao.UserDao;
import com.jsp.SpringProject.Entity.UserEntity;
@Repository
public class UserDetials  {
   @Autowired
	private UserRepository ur;
   
   public  List<UserEntity> getAllUaers() {
	  List<UserEntity> all = ur.findAll();
	   return all;
   }
   public UserEntity saveUser(UserEntity ue) {
	   UserEntity save = ur.save(ue);
	   return save;
   }
  
   public long countOfUsers() {
	   return ur.count();
   }
   

}
