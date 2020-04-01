package com.project.stockmanagement.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.project.stockmanagement.entity.Stock;
import com.project.stockmanagement.entity.UserStocks;



/**
 * @author sweta
 *
 */

@Repository
public class StockManagementNativeSqlRepo {

    @PersistenceContext
    EntityManager entityManager;


     public List<Stock> getStocksByStockName(StringBuffer whereQuery) {

    	Query query = entityManager.createNativeQuery("Select * from stock where " + whereQuery,
    			Stock.class);
    	
    	return query.getResultList();
        }


	public List<UserStocks> getUserStocksByStockId(StringBuffer whereQuery) {
		Query query = entityManager.createNativeQuery("Select * from user_stocks where " + whereQuery,
    			UserStocks.class);
    	
    	return query.getResultList();
		
	}
}
