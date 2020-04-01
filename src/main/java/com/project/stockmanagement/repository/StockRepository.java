package com.project.stockmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stockmanagement.entity.Stock;

@Repository
public interface StockRepository extends  JpaRepository<Stock,Long>{

}
