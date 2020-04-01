package com.project.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.stockmanagement.dto.UserStocksDto;
import com.project.stockmanagement.exception.RecordNotFoundException;
import com.project.stockmanagement.service.UserStockService;

@RestController
@RequestMapping("/userstocks")
public class UserStockController {

    @Autowired UserStockService userStockService;
	
	/**
	 * @return
	 * @throws RecordNotFoundException
	 */
	@GetMapping
    public List<UserStocksDto> fetchStocks() throws RecordNotFoundException {
		
        List<UserStocksDto> stocks = userStockService.getAllUserStocks();
        if (stocks.isEmpty()) {
			throw new RecordNotFoundException("No Stocks Present ");
		}
        else {
        return stocks;
        }
    }
	
	
	
	/**method to view stock of a particular user
	 * @param id
	 * @return
	 * @throws RecordNotFoundException
	 */
	@GetMapping("/{userid}")
	public List<UserStocksDto> getStockbyUserId(@PathVariable("userid") long id)
			throws RecordNotFoundException {
		List<UserStocksDto> list = userStockService.getUserStocksByid(id);
		if (list.isEmpty()) {
			throw new RecordNotFoundException("No Record found  Mathing the User id provided " + id);
		}

		else {
			return list;
		}
	}
	
	

	/**
	 * method to purchase stock
	 * @param userStockDto
	 * @return
	 */
	@PostMapping("/purchasestocks")	
    public ResponseEntity<Object> saveMultipleStock(@RequestBody List<UserStocksDto> userStockDto)
                                                 {
		List<UserStocksDto> updated = userStockService.saveMultipleStock(userStockDto);
        return new ResponseEntity<Object>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }


}
