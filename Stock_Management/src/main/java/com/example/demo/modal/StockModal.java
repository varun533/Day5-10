package com.example.demo.modal;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Stocks")
@Entity
public class StockModal {
    
    @Id
    private int id;
    private String name;
    private int stock_price;
    private int no_of_stocks;
    
   


    StockModal(){
        super();
    }

    StockModal(int id, String name, int stock_price, int no_of_stocks){
        super(); // Call the superclass constructor here
        this.id = id;
        this.name = name;
        this.stock_price = stock_price;
        this.no_of_stocks = no_of_stocks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock_price() {
        return stock_price;
    }

    public int getNo_of_stocks() {
        return no_of_stocks;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock_price(int stock_price) {
        this.stock_price = stock_price;
    }

    public void setNo_of_stocks(int no_of_stocks) {
        this.no_of_stocks = no_of_stocks;
    }
}
