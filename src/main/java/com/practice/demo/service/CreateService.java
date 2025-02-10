//package com.practice.demo.service;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.entity.ItemRepository;
//import com.practice.demo.form.ItemCreateForm;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * Createサービス。
// */
//@Service
//public class CreateService {
//
//    /** 商品リポジトリ */
//    private final ItemRepository itemRepository;
//
//    /** コンストラクタ */
//    @Autowired
//    public CreateService(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
//
//    /**
//     * 登録処理。
//     *
//     * @param createForm 商品登録フォーム
//     */
//    @Transactional
//    public void create(ItemCreateForm createForm) {
//        // 商品登録用のエンティティを作成
//        Item item = new Item();
//
//        // 入力値をセット
//        item.setName(createForm.getName());
//        int price = Integer.parseInt(createForm.getPrice());
//        item.setPrice(price);
//
//        // 登録処理
//        itemRepository.save(item);
//    }
//}
