//package com.example.demo.modal;
//
//import java.util.List;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//
//@Table(name = "user")
//@Entity
//public class User {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//    
//    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
//    private List<UserStock> stock_owned;
//    private int wallet_balance;
//
//    // No-argument constructor
//    public User() {
//        super();
//    }
//
//    // Constructor with parameters
//    public User(String name, List<UserStock> stock_owned, int wallet_balance) {
//        
//        this.name = name;
//        this.stock_owned = stock_owned;
//        this.wallet_balance = wallet_balance;
//    }
//
//    // Getters
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public List<UserStock> getStock_owned() {
//        return stock_owned;
//    }
//
//    public int getWallet_balance() {
//        return wallet_balance;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStock_owned(List<UserStock> stock_owned) {
//        this.stock_owned = stock_owned;
//    }
//
//    public void setWallet_balance(int wallet_balance) {
//        this.wallet_balance = wallet_balance;
//    }
//}