package com.project.stockmanagement.exception;

/**
 * Exception occurs when user with given user id not found.
 * 
 * @author Sweta
 *
 */
public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	private final Integer errorCode;

	public UserNotFoundException(String  message, Integer errorCode) {
		super(message);
		this.errorCode = errorCode;

	}

	public Integer getErrorCode() {
		return errorCode;
	}

}
