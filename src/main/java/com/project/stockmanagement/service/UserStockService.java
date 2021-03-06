package com.project.stockmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.stockmanagement.dto.StockDto;
import com.project.stockmanagement.dto.UserStocksDto;
import com.project.stockmanagement.entity.Stock;
import com.project.stockmanagement.entity.UserStocks;
import com.project.stockmanagement.mapper.Mapper;
import com.project.stockmanagement.repository.StockManagementNativeSqlRepo;
import com.project.stockmanagement.repository.StockRepository;
import com.project.stockmanagement.repository.UserStockRepository;
import com.project.stockmanagement.util.Preconditions;

/**
 * @author anup
 *
 */
/**
 * @author anup
 *
 */
@Service
public class UserStockService {

	@Autowired
	UserStockRepository userStockRepo;

	@Autowired
	StockManagementNativeSqlRepo smNativeSqlRepo;
	
	@Autowired
	 Mapper mapper;

		/**Method to fetch all user stocks
		 * @return UserStocksDto
		 */
		public List<UserStocksDto> getAllUserStocks() {
			List<UserStocksDto> stockDto = new ArrayList<UserStocksDto>();

			List<UserStocks> stockList = userStockRepo.findAll();
			if (stockList.size() > 0) {
				stockDto = mapper.userStockEntityListToDtoList(stockList);
			} 
			return stockDto;
		}

		
	/**Method to fetch user stock
	 * @param User_id
	 * @return
	 */
	public List<UserStocksDto> getUserStocksByid(long User_id) {

		StringBuffer whereQuery = new StringBuffer();

		whereQuery.append("user_id='").append(User_id).append("'");

		List<UserStocks> ls = smNativeSqlRepo.getUserStocksByStockId(whereQuery);

		if (ls.size() > 0) {
			List<UserStocksDto> userStockDto = mapper.userStockEntityListToDtoList(ls);
			return userStockDto;
		} else {

			return new ArrayList<UserStocksDto>();
		}
	
	}
	/**
	 * Method to validate the stocks
	 * @param stock
	 * @throws IllegalArgumentException
	 */
	  public UserStocksDto createUserStock(UserStocksDto stock) throws IllegalArgumentException {
		  UserStocksDto userStocksDto=new UserStocksDto();
		 validateStock(stock);
		  UserStocks userStock=userStockRepo.saveAndFlush(mapper.mapUserStockDtoEntity(stock));
		  userStocksDto= mapper.mapUserStocktoDto(userStock);
		  
		  return userStocksDto;
	       
	    }
	  
	  /**
		 * Method to validate the stocks
		 * @param stock
		 * @throws IllegalArgumentException
		 */
		  public List<UserStocksDto> saveMultipleStock(List<UserStocksDto> stockList) throws IllegalArgumentException {
			 List<UserStocks> userStockList=  new ArrayList<UserStocks>();
			 userStockList=mapper.userStockDtoListEntityList(stockList);
			  userStockRepo.saveAll(userStockList);
			  List<UserStocksDto> userStocksDto= mapper.userStockEntityListToDtoList(userStockList);
			  
			  return userStocksDto;
		       
		    }
	
	/**
	 * Method to validate the stocks
	 * @param stock
	 * @throws IllegalArgumentException
	 */
	private void validateStock(UserStocksDto stock) throws IllegalArgumentException {

        Preconditions.checkArgument(stock == null, "invalid stock data");
        Preconditions.checkArgument(stock.getStockid() <= 0, "invalid id");
        Preconditions.checkArgument(stock.getStockName() == null || stock.getStockName().trim().isEmpty(), "invalid name, cannot be blank");
        Preconditions.checkArgument(stock.getTotal_quantity() <=0 , "invalid stock data");
        Preconditions.checkArgument(stock.getTotal_price() < 0, "stock price cannot be negative");
    }
	
	
	
	

}
