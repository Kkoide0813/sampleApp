//package com.practice.demo.service;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.entity.ItemRepository;
//import com.practice.demo.form.ItemUpdateForm;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
///**
// * 商品更新サービス。
// */
//@Service
//public class UpdateService {
//
//    /** 商品リポジトリ */
//    private final ItemRepository itemRepository;
//
//    /** コンストラクタ */
//    @Autowired
//    public UpdateService(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
//
//    /**
//     * IDで商品を取得。
//     *
//     * @param id ID
//     * @return 商品
//     */
//    @Transactional(readOnly = true)
//    public Item getById(int id) {
//        Optional<Item> item = this.itemRepository.findById(id);
//        return item.orElse(null);
//    }
//
//    /**
//     * 更新処理。
//     *
//     * @param updateForm 商品更新フォーム
//     */
//    @Transactional
//    public void update(ItemUpdateForm updateForm) {
//        // 更新対象の商品を取得
//        int id = Integer.parseInt(updateForm.getId());
//        Item item = getById(id);
//
//        // 入力値をセット
//        item.setName(updateForm.getName());
//        int price = Integer.parseInt(updateForm.getPrice());
//        item.setPrice(price);
//
//        // 更新処理
//        itemRepository.save(item);
//    }
//}