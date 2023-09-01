//package com.example.demo.modal;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Table(name = "UserStock")
//@Entity
//public class UserStock {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//    private int no_of_stock; // Change this to store the number of stocks
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "stock_id") // This column should match your database schema
//    private StockModal stock; // Reference to the StockModal entity
//
//    // No-argument constructor
//    public UserStock() {
//        super();
//    }
//
//    // Constructor with parameters
//    public UserStock(int no_of_stock, StockModal stock) {
//        this.no_of_stock = no_of_stock;
//        this.stock = stock;
//    }
//
//    // Getter for 'no_of_stock'
//    public int getNo_of_stock() {
//        return no_of_stock;
//    }
//
//    // Setter for 'no_of_stock'
//    public void setNo_of_stock(int no_of_stock) {
//        this.no_of_stock = no_of_stock;
//    }
//
//    // Getter for 'stock'
//    public StockModal getStock() {
//        return stock;
//    }
//
//    // Setter for 'stock'
//    public void setStock(StockModal stock) {
//        this.stock = stock;
//    }
//}
