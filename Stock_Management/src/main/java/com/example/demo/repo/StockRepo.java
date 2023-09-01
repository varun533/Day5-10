package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.StockModal;

@Repository
public interface StockRepo extends JpaRepository<StockModal, Integer> {

}
