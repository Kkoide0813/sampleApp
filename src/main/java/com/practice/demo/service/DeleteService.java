package com.practice.demo.service;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.entity.ItemRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//

/**
 * Deleteサービス。
 */

import com.practice.demo.entity.Item;
import com.practice.demo.entity.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class DeleteService {

    /** フィールド */
    private ItemRepository itemRepository;

    /** コンストラクタ **/
    @Autowired
    public DeleteService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    /**
     * IDで商品取得
     *
     * @param id ID
     * @return 商品
     *
     */
    @Transactional
    public Item getById(int id){
        Optional<Item> item = this.itemRepository.findById(id);
        return item.orElse(null); // orElseの引数にnullと記載することで、nullの時に、”null”と値を返す。
    }

    /**
     * IDで商品削除
     *
     * @param id ID
     * @return 商品
     *
     */
    @Transactional
    public Item deleteById(int id){
        this.itemRepository.deleteById(id);
//        System.out.println( id + "の削除完了");
        return null;
    }
}


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
