package com.project.stockmanagement.exception;
/**
 *  class for reading the exception message and error code from property file
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:messages.properties")
public class ExceptionMessageProprties {

	@Value("${com.project.exception.usernotfound.message}")
	private String userNotFoundMessage;

	@Value("${com.project.exception.usernotfound.errorcode}")
	private Integer userNotFoundErrorCode;

	@Value("${com.project.exception.stocknotfound.message}")
	private String stockNotFoundMessage;

	@Value("${com.project.exception.stocknotfound.errorcode}")
	private Integer stockNotFoundErrorCode;

	@Value("${com.project.exception.stocknotavailable.message}")
	private String stockNotAvailableMessage;

	@Value("${com.project.exception.stocknotavailable.errorcode}")
	private Integer stockNotAvailableErrorCode;

	@Value("${com.project.exception.stocknamenotfound.message}")
	private String stockNameNotFoundMessage;
	
	@Value("${com.project.exception.stocknamenotfound.errorcode}")
	private Integer stockNameNotFoundErrorCode;

	public String getUserNotFoundMessage() {
		return userNotFoundMessage;
	}

	public Integer getUserNotFoundErrorCode() {
		return userNotFoundErrorCode;
	}

	public String getStockNotFoundMessage() {
		return stockNotFoundMessage;
	}

	public Integer getStockNotFoundErrorCode() {
		return stockNotFoundErrorCode;
	}

	public String getStockNotAvailableMessage() {
		return stockNotAvailableMessage;
	}

	public Integer getStockNotAvailableErrorCode() {
		return stockNotAvailableErrorCode;
	}

	public String getStockNameNotFoundMessage() {
		return stockNameNotFoundMessage;
	}

	public Integer getStockNameNotFoundErrorCode() {
		return stockNameNotFoundErrorCode;
	}
	

}
