package com.jsp.SpringProject.Util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.SpringProject.Dao.ResponseStructure;
import com.jsp.SpringProject.Dao.UserDao;

@RestControllerAdvice
public class ExceptionHandlerUtil {
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handler(NoDataFoundException ie)
	{
		ResponseStructure<String> re=new ResponseStructure<>();
		re.setStatusCode(HttpStatus.NOT_FOUND.value());
		re.setData(ie.getMessage());
		re.setMessage("No Data");
		return new ResponseEntity<ResponseStructure<String>>(re,HttpStatus.NOT_FOUND);
	}
}
