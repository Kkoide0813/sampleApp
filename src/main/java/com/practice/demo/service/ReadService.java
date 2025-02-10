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
