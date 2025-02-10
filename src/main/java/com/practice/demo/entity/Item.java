package com.practice.demo.entity;

import javax.persistence.*;

// itemテーブルをJavaオブジェクトとして扱う
@Entity
@Table(name= "items")
public class Item{
    @Id // primaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自動でIDを生成
    @Column(name = "id") // id
    private int id;

    @Column(name = "name", nullable = false) // 名前 nullを許容しない
    private String name;

    @Column(name = "price", nullable = false) // 価格 nullを許容しない
    private int price;

    // Entityに値を設定、取得 getter/setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}


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
//    public void setPrice(int price) {
//        this.price = price;
//
//    }
//}