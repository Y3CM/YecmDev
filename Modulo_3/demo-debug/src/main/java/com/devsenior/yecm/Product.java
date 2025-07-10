package com.devsenior.yecm;

public class Product {
private String name;
private Integer stock;
private Double price;

public Product (String name,Integer stock, Double price){
    this.name = name;
    this.stock = stock;
    this.price = price;
}

public String getName(){
    return name;
}

public Integer getStock(){
    return stock;
}

public Double getPrice(){
    return price;
}

public void setName(String name){
    this.name = name;
}

public void setStock(Integer stock){
    this.stock = stock;
}

public void setPrice(Double price){
    this.price = price;
}
}
