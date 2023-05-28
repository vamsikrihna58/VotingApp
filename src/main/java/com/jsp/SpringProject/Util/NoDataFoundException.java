package com.jsp.SpringProject.Util;

public class NoDataFoundException extends RuntimeException {
	String message="No Voters are available";
	
	@Override
	public String getMessage() {
		return message;
	}

}
