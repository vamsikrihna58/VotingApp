package com.jsp.SpringProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.SpringProject.Dao.ResponseStructure;
import com.jsp.SpringProject.Dao.UserDao;
import com.jsp.SpringProject.Entity.UserEntity;
import com.jsp.SpringProject.Rpository.UserDetials;
import com.jsp.SpringProject.Service.UserService;
import com.jsp.SpringProject.Util.NoDataFoundException;
@Service
public class ServiceImplementation implements UserService {
	@Autowired
	private UserDetials ud;

	@Override
	public List<UserEntity> allVoters() {
		return ud.getAllUaers();
	}

	@Override
	public ResponseStructure<UserDao> save(UserDao dao) {
		UserEntity uentity = new UserEntity(dao);
		List<UserEntity> allVoters = allVoters();
		ResponseStructure<UserDao> re= new ResponseStructure<>();
		if (allVoters.size() == 0) {
			//re.setData(uentity);
			UserEntity saveUser = ud.saveUser(uentity);
			UserDao da=new UserDao(saveUser);
			re.setData(da);
			re.setStatusCode(HttpStatus.FOUND.value());
			re.setMessage("you have to go for vote");
			return re;
			
		} else {
			for (UserEntity u : allVoters) {
				if (u.getAdhar().equals(uentity.getAdhar())) {
					UserDao da=new UserDao(u);
					re.setData(da);
					re.setStatusCode(HttpStatus.ALREADY_REPORTED.value());
					re.setMessage("you are adhar detials are matched to my data base that means you are vote is alredy completed");
					return re;

				}

			}

		}
		UserEntity saveUser = ud.saveUser(uentity);
		UserDao da=new UserDao(saveUser);
		re.setData(da);
		re.setStatusCode(HttpStatus.OK.value());
		re.setMessage("you have to go for vote");
		 return re;
	}

	@Override
	public ResponseStructure<List<UserEntity>> getAllUser() {
		List<UserEntity> allUaers = ud.getAllUaers();
		if(allUaers.size() ==0) {
			ResponseStructure<List<UserEntity>> re= new ResponseStructure<>();
			re.setData(allUaers);
			re.setStatusCode(HttpStatus.OK.value());
			re.setMessage("you have to go for vote");
			return re;
		}
		throw new NoDataFoundException();
		
		
	}

	
	}

	
	
	

