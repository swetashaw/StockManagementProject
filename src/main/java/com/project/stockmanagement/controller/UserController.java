package com.project.stockmanagement.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.stockmanagement.dto.UserDto;
import com.project.stockmanagement.exception.RecordNotFoundException;
import com.project.stockmanagement.exception.UserNotFoundException;
import com.project.stockmanagement.responsedto.UserResponseDto;
import com.project.stockmanagement.responsedto.UserResponseDtoList;
import com.project.stockmanagement.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	Logger log = Logger.getLogger(UserController.class);
	
	/**
	 * @return List of users
	 * @throws UserNotFoundException 
	 */
	@GetMapping("/user")
	public ResponseEntity<UserResponseDtoList> getAllAccounts() throws UserNotFoundException {
		log.info("inside get all user accounts");
		UserResponseDtoList list = new UserResponseDtoList();
		list.setStatusCode(600);
		list.setMessage("user details fetched successfully");
		list.setUserResponseDtoListReturn(userService.getAllUsers());
		return ResponseEntity.status(HttpStatus.OK).body(list);
		 
	}
	
	

	/**
	 * @param id
	 * @return List of user based on user id passed
	 * @throws RecordNotFoundException
	 * @throws UserNotFoundException 
	 */
	@GetMapping("/user/{id}")
	public ResponseEntity<UserResponseDto> getUserById(@PathVariable("id") Long id) throws  UserNotFoundException {
		UserResponseDto userDto= userService.getUserId(id);
		return ResponseEntity.status(HttpStatus.OK).body(userDto);

	}
	
	



}
