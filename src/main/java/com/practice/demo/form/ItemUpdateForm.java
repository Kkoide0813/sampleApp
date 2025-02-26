package com.practice.demo.form;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * 商品更新フォーム。
 */

public class ItemUpdateForm{
    // フィールド
    private String id;
    @NotBlank(message = "商品名は必須です。") // 入力必須
    @Size(max = 45, message = "45文字以内で入力してください。")
    private String name;
    @NotBlank(message = "値段は必須です。") // 入力必須
    @Size(max = 45, message = "9桁以内で入力してください。")
    @Pattern(regexp = "^[0-9]*$", message = "値段は半角数字で入力してください。") // 入力文字の形式を制御
    private String price; // 入力段階ではintにはできない

    // getter,setter
    public String getId() {

        return id;
    }
    public void setId(String id){

        this.id = id;
    }
    public String getName() {

        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getPrice(){

        return price;
    }
    public void setPrice(String price){

        this.price = price;
    }
}


//public class ItemUpdateForm {
//
//    private String id;
//
//    @NotBlank(message = "商品名は必須です。")
//    @Size(max = 45, message = "45文字以内で入力してください。")
//    private String name;
//
//    @NotBlank(message = "値段は必須です。")
//    @Size(max = 9, message = "9桁以内で入力してください。")
//    @Pattern(regexp = "^[0-9]*$", message = "値段は半角数字で入力してください。")
//    private String price;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
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
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
//}