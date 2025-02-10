//package com.practice.demo.service;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.entity.ItemRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
///**
// * Deleteサービス。
// */
//@Service
//public class DeleteService {
//
//    /** 商品リポジトリ */
//    private final ItemRepository itemRepository;
//
//    /** コンストラクタ */
//    @Autowired
//    public DeleteService(ItemRepository itemRepository) {
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
//     * 商品削除。
//     *
//     * @param id ID
//     */
//    @Transactional
//    public void deleteById(int id) {
//        this.itemRepository.deleteById(id);
//    }
//}
