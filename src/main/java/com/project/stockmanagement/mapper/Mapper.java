package com.project.stockmanagement.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.project.stockmanagement.dto.StockDto;
import com.project.stockmanagement.dto.UserDto;
import com.project.stockmanagement.dto.UserStocksDto;
import com.project.stockmanagement.entity.Stock;
import com.project.stockmanagement.entity.User;
import com.project.stockmanagement.entity.UserStocks;

/**
 * @author Sweta
 *
 */
@Component
public class Mapper {

	public UserDto mapUserEntitytoDto(User user) {

		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setActive(user.isActive());
		userDto.setEmail(user.getEmail());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setRole(user.getRole());
		userDto.setUserName(user.getUserName());
		return userDto;

	}

	public User mapUserEntitytoDto(UserDto userdto) {

		User user = new User();
		user.setId(userdto.getId());
		user.setActive(userdto.isActive());
		user.setEmail(userdto.getEmail());
		user.setFirstName(userdto.getFirstName());
		user.setLastName(userdto.getLastName());
		user.setRole(userdto.getRole());
		user.setUserName(userdto.getUserName());
		return user;

	}

	public List<UserDto> mapUserEntityListToDtoList(List<User> userList) {

		List<UserDto> userDto = new ArrayList<UserDto>();

		if (!CollectionUtils.isEmpty(userList)) {
			for (User usr : userList) {
				userDto.add(mapUserEntitytoDto(usr));

			}
		}
		return userDto;

	}

//Stock Management Mappers

	public List<StockDto> StockEntityListToDtoList(List<Stock> ls) {
		List<StockDto> stockDto = new ArrayList<StockDto>();

		if (!CollectionUtils.isEmpty(ls)) {
			for (Stock stockfor : ls) {
				stockDto.add(mapStocktoDto(stockfor));

			}
		}
		return stockDto;
	}

	public StockDto mapStocktoDto(Stock stock) {

		StockDto stockDto = new StockDto();
		stockDto.setId(stock.getId());
		stockDto.setActive(stock.isActive());
		stockDto.setPricePerUnit(stock.getPricePerUnit());
		stockDto.setQuantity(stock.getQuantity());
		stockDto.setStockName(stock.getStockName());
		return stockDto;
	}

	public Stock mapStockDtoStock(StockDto stockdto) {

		Stock stock = new Stock();
		stock.setId(stockdto.getId());
		stock.setActive(stockdto.isActive());
		stock.setPricePerUnit(stockdto.getPricePerUnit());
		stock.setQuantity(stockdto.getQuantity());
		stock.setStockName(stockdto.getStockName());
		return stock;
	}

	public UserStocksDto mapUserStocktoDto(UserStocks userStock) {

		UserStocksDto userStockDto = new UserStocksDto();
		userStockDto.setId(userStock.getId());
		userStockDto.setStockid(userStock.getStocks().getId());
		userStockDto.setUserid(userStock.getUsers().getId());
		userStockDto.setStockName(userStock.getStockName());
		userStockDto.setPurchasedOn(userStock.getPurchasedOn());
		userStockDto.setTotal_price(userStock.getTotal_price());
		userStockDto.setTotal_quantity(userStock.getTotal_quantity());
		return userStockDto;
	}

	public UserStocks mapUserStockDtoEntity(UserStocksDto userStockdto) {

		UserStocks userStoc = new UserStocks();
		userStoc.setId(userStockdto.getId());
		Stock stock = new Stock();
		stock.setId(userStockdto.getStockid());
		userStoc.setStocks(stock);
		User user = new User();
		user.setId(userStockdto.getUserid());
		userStoc.setUsers(user);
		userStoc.setStockName(userStockdto.getStockName());
		userStoc.setPurchasedOn(userStockdto.getPurchasedOn());
		userStoc.setTotal_price(userStockdto.getTotal_price());
		userStoc.setTotal_quantity(userStockdto.getTotal_quantity());
		return userStoc;
	}

	public List<UserStocksDto> userStockEntityListToDtoList(List<UserStocks> stockList) {
		List<UserStocksDto> stockDto = new ArrayList<UserStocksDto>();

		if (!CollectionUtils.isEmpty(stockList)) {
			for (UserStocks userStockFor : stockList) {
				stockDto.add(mapUserStocktoDto(userStockFor));

			}
		}
		return stockDto;
	}

	public List<UserStocks> userStockDtoListEntityList(List<UserStocksDto> dtoStockList) {
		List<UserStocks> userStocks = new ArrayList<UserStocks>();

		if (!CollectionUtils.isEmpty(dtoStockList)) {
			for (UserStocksDto userStockFor : dtoStockList) {
				userStocks.add(mapUserStockDtoEntity(userStockFor));

			}
		}
		return userStocks;
	}

}
