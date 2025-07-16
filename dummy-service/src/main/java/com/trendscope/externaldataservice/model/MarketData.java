package com.trendscope.externaldataservice.model;

import java.math.BigDecimal;

public class MarketData {
    private String product;
    private BigDecimal price;
    private int sales;
    private String brand;
    private String category;
    
    public MarketData() {}
    
    public MarketData(String product, BigDecimal price, int sales, String brand, String category) {
        this.product = product;
        this.price = price;
        this.sales = sales;
        this.brand = brand;
        this.category = category;
    }
    
    // Getters and Setters
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    
    public int getSales() { return sales; }
    public void setSales(int sales) { this.sales = sales; }
    
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
} 
