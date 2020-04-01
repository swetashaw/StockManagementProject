package com.project.stockmanagement.contollertest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.project.stockmanagement.controller.StockController;

@SpringBootTest
@WebMvcTest
public class StockManagementControllerTest {
	
	  @Autowired private MockMvc mockmvc;
	  
	  @Autowired private StockController stockController;
	 
	@Test
	public void fetchStocksTest() {
		
		 
	}

}
