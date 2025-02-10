package com.practice.demo.controller;
/**
* Readコントローラ
*/

import com.practice.demo.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/read")
public class ReadController {

    /** フィールド */
    private final ReadService readService;

    /** コンストラクタ */
    @Autowired
    public ReadController(ReadService readService){
        this.readService = readService;
    }

    /**
     * 商品一覧初期表示。
     *
     * @param model モデル
     * @return Path
     */
    // init.htmlにアクセスした際にitemListビューを返す。
    // ビューに返すデータはReadServiceクラスのgetDisplayDate()を呼び出し、日時を取得。Modelオブジェクトを使って設定される。
    @RequestMapping(value = "/init")
    public String init(Model model){
        String displayDate = this.readService.getDisplayDate(); // 現在の日時取得
        model.addAttribute("displayDate", displayDate); // Thymeleafにデータを渡す。
        return "itemList";
    }
}

//package com.practice.demo.controller;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.service.ReadService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
///**
// * Readコントローラ。
// */
//@Controller
//@RequestMapping(value = "/read")
//public class ReadController {
//
//    /** Readサービス */
//    private final ReadService service;
//
//    /** コンストラクタ */
//    @Autowired
//    public ReadController(ReadService service) {
//        this.service = service;
//    }
//
//    /**
//     * 商品一覧初期表示。
//        *
//        * @param model モデル
//     * @return Path
//     */
//    @RequestMapping(value = "/init")
//    public String init(Model model) {
//        // 表示用の日付を取得
//        String displayDate = this.service.getDisplayDate();
//        model.addAttribute("displayDate", displayDate);
//
//        // 全商品のリストを取得
//        List<Item> items = this.service.findAllItems();
//        model.addAttribute("items", items);
//
//        return "itemList";
//    }
//}
