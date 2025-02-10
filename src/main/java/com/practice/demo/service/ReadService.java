package com.practice.demo.service;


import com.practice.demo.entity.Item;
import com.practice.demo.entity.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Readサービス
 **/
@Service
public class ReadService {

    /** フィールド */
    private final ItemRepository itemRepository;

    /** コンストラクタ */
    @Autowired
    public ReadService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Transactional // DBとのやり取りに使うアノテーション,データの読み込みだけのためreadOnly = true
    public List<Item> findAllItems(){
        return this.itemRepository.findAll();
    }

    // 現在の日付を取得する処理
    public String getDisplayDate(){

        //現在時刻でカレンダーのインスタンスを取得
        Date date = new Date();
//        Calendar cal = Calendar.getInstance();

        //SimpleDateFormatで書式を指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        // 文字列型に変換しdisplayDateに格納
        String displayDate = sdf.format(date);

        return displayDate;
    }
}
//package com.practice.demo.service;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.entity.ItemRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * Readサービス。
// */
//@Service
//public class ReadService {
//
//    /** 商品リポジトリ */
//    private final ItemRepository itemRepository;
//
//    /** コンストラクタ */
//    @Autowired
//    public ReadService(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
//
//    /**
//     * 表示用の日付取得。
//     *
//     * @return 表示用の日付（yyyy年MM月dd日）
//     */
//    public String getDisplayDate() {
//        // システム日付を取得
//        Date date = new Date();
//
//        // yyyy年MM月dd日の形式に変換
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        String displayDate = simpleDateFormat.format(date);
//
//        return  displayDate;
//    }
//
//    /**
//     * 全商品取得。
//     *
//     * @return 全商品のリスト
//     */
//    @Transactional(readOnly = true)
//    public List<Item> findAllItems() {
//        return this.itemRepository.findAll();
//    }
//}
