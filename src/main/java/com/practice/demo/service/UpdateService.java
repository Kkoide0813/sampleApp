package com.practice.demo.service;

//import com.practice.demo.form.ItemUpdateForm;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
import com.practice.demo.entity.Item;
import com.practice.demo.entity.ItemRepository;
import com.practice.demo.form.ItemCreateForm;
import com.practice.demo.form.ItemUpdateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * 商品更新サービス。
 */
@Service
public class UpdateService {

    // フィールド
    private ItemRepository itemRepository;

    // コンストラクタ
    @Autowired
    public UpdateService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    /**
     * IDで商品取得
     *
     * @param id ID
     * @return 商品
     *
     */
    // コントローラからidを受け取り、エンティティから商品情報を取得する
    @Transactional
    public Item getById(int id){
        Optional<Item> item = this.itemRepository.findById(id);
        return item.orElse(null); // orElseの引数にnullと記載することで、nullの時に、”null”と値を返す。
    }

    /** 更新処理
     *
     * @param updateForm 商品更新フォーム
     *
     */
    @Transactional // DBへの登録処理をする
    public void update(ItemUpdateForm updateForm){ // updateFormがitemUpdateFormを受け取り

        // 更新対象の商品を取得
        // 入力済みのフォームのidを取得
        int id = Integer.parseInt(updateForm.getId()); // String型はint型に変換が必要
        // idをエンティティから検索し、エンティティ型の変数itemへ格納
        Item item = getById(id); // 同じクラス内ならpublicのメソッド使える
        // 入力済みのフォームからnameを取得した値を、エンティティのsetName（）に渡す。
        item.setName(updateForm.getName());
        int price = Integer.parseInt(updateForm.getPrice()); // String型はint型に変換が必要
        item.setPrice(price);

        // DB登録処理
        itemRepository.save(item);
    }

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


}





















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