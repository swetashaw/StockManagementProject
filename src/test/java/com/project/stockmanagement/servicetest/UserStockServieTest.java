package com.project.stockmanagement.servicetest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.stockmanagement.dto.UserStocksDto;
import com.project.stockmanagement.entity.UserStocks;
import com.project.stockmanagement.repository.UserStockRepository;
import com.project.stockmanagement.service.UserStockService;

@SpringBootTest
@WebMvcTest
public class UserStockServieTest {
	
	@Mock
    private UserStockRepository repoMock;
	
	@Autowired
    private UserStockService service;
	
	UserStocks userStocks;
	UserStocksDto userStockDto;
	List<UserStocksDto> userStockDtoList=new ArrayList<UserStocksDto>();
    
	
	@BeforeEach
	public void setUp() {
		Long id=(long) 1;
		userStockDto.setId(id);
		userStockDto.setStockid(id);
		userStockDto.setUserid(id);
		userStockDto.setStockName("AdityaBirla");
		userStockDto.setTotal_price(10000);
		userStockDto.setTotal_quantity(10);
		userStockDto.setPurchasedOn(new Date());
		
		
		userStockDtoList.add(userStockDto);

	}
	
	@Test
	public void getAllUserStocksTest() {

	
	}

	
	@Test
	public void  getUserStocksByidTest() {
		/*
		 * when(service.getUserStocksByid(userStockDto.getUserid())).
		 * thenReturn(userStockDtoList); List<UserStocksDto> userStockDtoadd1=new
		 * ArrayList<UserStocksDto>();
		 * userStockDtoadd1=service.getUserStocksByid(userStockDto.getUserid());
		 * //assertFalse(userStockDtoadd1.isEmpty());
		 * assertThat(userStockDtoList.size()).isEqualTo(userStockDtoadd1.size());
		 */
		  
	}
	@Test
	public void createUserStockTest() {
		/*
		 * when(repoMock.save(any(UserStocks.class))).thenReturn(new UserStocks());
		 * 
		 * UserStocksDto userStocksDto = new UserStocksDto();
		 * 
		 * assertThat(service.createUserStock(userStocksDto), is(notNullValue()));
		 */
	
	}
	
	@Test
	public void saveMultipleStockTest() {
	
	}

}
