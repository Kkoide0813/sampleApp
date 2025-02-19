//package com.practice.demo.controller;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.service.DeleteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * Deleteコントローラ。
// */
//@Controller
//@RequestMapping(value = "/delete")
//public class DeleteController {
//
//    /** Deleteサービス */
//    private final DeleteService service;
//
//    /** コンストラクタ */
//    @Autowired
//    public DeleteController(DeleteService deleteService) {
//        this.service = deleteService;
//    }
//
//    /**
//     * 商品詳細初期表示。
//     *
//     * @param id 商品のID
//     * @return Path
//     */
//    @RequestMapping(value = "/init")
//    public String init(@RequestParam int id, Model model) {
//        Item item = this.service.getById(id);
//        model.addAttribute("item", item);
//        return "itemDetail";
//    }
//
//    /**
//     * 商品削除。
//     *
//     * @param id 削除対象の商品ID
//     * @return Path
//     */
//    @RequestMapping(value = "/do", method = RequestMethod.POST)
//    public String delete(@RequestParam int id) {
//        this.service.deleteById(id);
//        return "redirect:/read/init";
//    }
//}

