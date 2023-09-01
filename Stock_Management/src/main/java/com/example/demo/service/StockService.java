package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.StockModal;
import com.example.demo.repo.StockRepo;

@Service
public class StockService {
	
	@Autowired
	StockRepo sr;
	
	public List<StockModal> showStocks() {
		return sr.findAll();
	}
	
	public void addStocks(List<StockModal> sm) {
		sr.saveAll(sm);
	}
	
	public void deleteStocks(int id) {
		sr.deleteById(id);;
	}
	
	public void updateStocks(StockModal sm) {
		sr.saveAndFlush(sm);
	}
	
	public String buyStocks(int id,int count) {
		Optional<StockModal> optionalStock = sr.findById(id);

	    if (optionalStock.isPresent()) {
	        StockModal sm = optionalStock.get();
	        int currentStockCount = sm.getNo_of_stocks();

	        if (currentStockCount >= count) {
	            sm.setNo_of_stocks(currentStockCount - count);

	            // Save the updated StockModal entity back to the database
	            sr.save(sm);
	            return "Stock buy is successfull";
	        } else {
	            return "Sorry stocks are unavailable";
	        }
	    } else {
	       return "the Requested Stock is not available";
	    }
	}

	
}
