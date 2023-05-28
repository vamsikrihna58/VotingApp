package com.jsp.SpringProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringProject.Dao.ResponseStructure;
import com.jsp.SpringProject.Dao.UserDao;
import com.jsp.SpringProject.Entity.UserEntity;
import com.jsp.SpringProject.ServiceImpl.ServiceImplementation;

@RestController
public class TestController {
	@Autowired
	private ServiceImplementation si;
	
	@PostMapping("/save")
	public ResponseStructure<UserDao> save(@RequestBody UserDao dao) {
		return si.save(dao);
		
	}
	@GetMapping("/save")
	public ResponseStructure<List<UserEntity>>  getsAll() {
		return si.getAllUser();
	}

}
