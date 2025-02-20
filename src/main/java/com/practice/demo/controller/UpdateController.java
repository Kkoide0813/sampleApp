//package com.practice.demo.controller;
//
//import com.practice.demo.entity.Item;
//import com.practice.demo.form.ItemUpdateForm;
//import com.practice.demo.service.UpdateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * 商品更新コントローラ。
// */
//@Controller
//@RequestMapping(value = "/update")
//public class UpdateController {
//
//    /** Updateサービス */
//    private final UpdateService service;
//
//    /** コンストラクタ */
//    @Autowired
//    public UpdateController(UpdateService updateService) {
//        this.service = updateService;
//    }
//
//    /**
//     * 商品更新初期表示。
//     *
//     * @param id 対象の商品ID
//     * @param model モデル
//     * @return Path
//     */
//    @RequestMapping(value = "/init", method = RequestMethod.POST)
//    public String updateInit(@RequestParam int id, Model model) {
//        Item item = this.service.getById(id);
//        model.addAttribute("itemUpdateForm", item);
//        return "itemUpdateForm";
//    }
//
//    /**
//     * 商品更新完了画面表示。
//     *
//     * @param itemUpdateForm 商品更新フォーム
//     * @param bindingResult 商品更新フォーム精査結果
//     * @return Path
//     */
//    @RequestMapping(value = "/do", method = RequestMethod.POST)
//    public String updateComplete(@ModelAttribute @Validated ItemUpdateForm itemUpdateForm, BindingResult bindingResult) {
//        // BeanValidationのエラー確認
//        if (bindingResult.hasErrors()) {
//            return "itemUpdateForm";
//        }
//
//        // 商品情報更新
//        service.update(itemUpdateForm);
//        return "redirect:/read/init";
//    }
//}
//
