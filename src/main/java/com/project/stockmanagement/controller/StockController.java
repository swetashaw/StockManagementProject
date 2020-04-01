package com.project.stockmanagement.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.stockmanagement.dto.StockDto;
import com.project.stockmanagement.exception.RecordNotFoundException;
import com.project.stockmanagement.service.StockManagementService;

/**
 * @author Sweta
 *
 */
@RestController
@RequestMapping("/stocks")
public class StockController {

	  @Autowired StockManagementService stockService;
	  
	 
	
	/**
	 * Method to fetch all stocks
	 * @return
	 * @throws RecordNotFoundException
	 */
	@GetMapping
    public ResponseEntity<List<StockDto>> fetchStocks() throws RecordNotFoundException {
		
        List<StockDto> stocks = stockService.getAllStocks();
        if (stocks.isEmpty()) {
			throw new RecordNotFoundException("No Stocks Present");
		}
        else {
        return new ResponseEntity<>(stocks, HttpStatus.OK);
        }
    }
	
	
	
	/**
	 * Method to fetch stock by name
	 * @param StockName
	 * @return
	 * @throws RecordNotFoundException
	 */
	@GetMapping("{stock_name}")
	public ResponseEntity<List<StockDto>> getStockOnStockName(@PathVariable("stock_name") String StockName)
			throws RecordNotFoundException {
		List<StockDto> list = stockService.getStocksByName(StockName);
		return new ResponseEntity<>(list, HttpStatus.OK);
		
		
	}
}
