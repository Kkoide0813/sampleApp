//package com.practice.demo.entity;
//
//import javax.persistence.*;
//
///**
// * 商品エンティティ。
// */
//@Entity
//@Table(name = "items")
//public class Item {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name", nullable = false)
//    private String name;
//
//    @Column(name = "price", nullable = false)
//    private int price;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//}