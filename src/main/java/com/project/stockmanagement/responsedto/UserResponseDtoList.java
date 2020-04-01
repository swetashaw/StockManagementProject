package com.project.stockmanagement.responsedto;

import java.util.ArrayList;
import java.util.List;

import com.project.stockmanagement.dto.UserDto;
	
public class UserResponseDtoList {
	
	
	private int statusCode;

	private String message; 
	
	List<UserDto> userResponseDtoListReturn=new ArrayList<UserDto>();
	/*
	 * public UserResponseDtoList(List<UserDto> userDTOList) {
	 * if(!CollectionUtils.isEmpty(userDTOList)) {
	 * 
	 * for(UserDto userResponseLoop:userDTOList) {
	 * userResponseDtoListReturn.add(userResponseLoop); }
	 * 
	 * }
	 * 
	 * }
	 */

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<UserDto> getUserResponseDtoListReturn() {
		return userResponseDtoListReturn;
	}

	public void setUserResponseDtoListReturn(List<UserDto> userResponseDtoListReturn) {
		this.userResponseDtoListReturn = userResponseDtoListReturn;
	}
	
	

}
