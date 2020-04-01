package com.project.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stockmanagement.entity.UserStocks;

@Repository
public interface UserStockRepository extends  JpaRepository<UserStocks,Long>{

}
