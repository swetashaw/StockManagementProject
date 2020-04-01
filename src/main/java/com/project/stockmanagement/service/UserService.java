package com.project.stockmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.project.stockmanagement.dto.UserDto;
import com.project.stockmanagement.entity.User;
import com.project.stockmanagement.exception.ExceptionMessageProprties;
import com.project.stockmanagement.exception.RecordNotFoundException;
import com.project.stockmanagement.exception.UserNotFoundException;
import com.project.stockmanagement.mapper.Mapper;
import com.project.stockmanagement.repository.UserRepository;
import com.project.stockmanagement.responsedto.UserResponseDto;
import com.project.stockmanagement.responsedto.UserResponseDtoList;

/**
 * @author Sweta
 * User Service Class
 */
@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	
	
	@Autowired
	Mapper mapper;
	
	@Autowired
	ExceptionMessageProprties exceptionMessageProprties;
	Logger log = LogManager.getLogger(UserService.class);
	
	/**
	 * @return List of All users
	 * @throws UserNotFoundException 
	 */
	public List<UserDto> getAllUsers() throws UserNotFoundException {
		List<User> userList = userRepo.findAll();
		log.info("Inside GetAll Users");
		  if (!CollectionUtils.isEmpty(userList) ) { 
		  List<UserDto> userDTOList=mapper.mapUserEntityListToDtoList(userList); 
		  return userDTOList;
		  } else {
		  
		  return new ArrayList<UserDto>(); }
		 
		
	}	
	
	/**
	 * @param id
	 * @return User list
	 * @throws RecordNotFoundException
	 * @throws UserNotFoundException 
	 */
	public UserResponseDto getUserId(Long id) throws  UserNotFoundException {
        Optional<User> user=userRepo.findById(id);
		
		if (user.isPresent() ) {
			UserResponseDto userDto=new UserResponseDto(user.get().getId(),user.get().getEmail(),user.get().getFirstName(),
					user.get().getLastName(),user.get().getUserName(),user.get().getRole(),user.get().isActive());
			return userDto;
		} else {
            log.info("inside else");
			throw new UserNotFoundException(exceptionMessageProprties.getUserNotFoundMessage(), exceptionMessageProprties.getUserNotFoundErrorCode());

		}
	}
	
	
}
