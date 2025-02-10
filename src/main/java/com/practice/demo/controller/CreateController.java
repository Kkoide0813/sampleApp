//package com.practice.demo.controller;
//
//import com.practice.demo.form.ItemCreateForm;
//import com.practice.demo.service.CreateService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * Createコントローラ。
// */
//@Controller
//@RequestMapping(value = "/create")
//public class CreateController {
//
//    /** Createサービス */
//    private final CreateService service;
//
//    /** コンストラクタ */
//    @Autowired
//    public CreateController(CreateService createService) {
//        this.service = createService;
//    }
//
//    /**
//     * 商品登録初期表示。
//     *
//     * @param itemCreateForm 商品登録フォーム
//     * @return Path
//     */
//    @RequestMapping(value = "/init")
//    public String init(@ModelAttribute ItemCreateForm itemCreateForm) {
//        return "itemCreateForm";
//    }
//
//    /**
//     * 商品登録。
//     *
//     * @param itemCreateForm 精査済み商品登録フォーム
//     * @param bindingResult 商品登録フォーム精査結果
//     * @return Path
//     */
//    @RequestMapping(value = "/do", method = RequestMethod.POST)
//    public String create(@ModelAttribute @Validated ItemCreateForm itemCreateForm, BindingResult bindingResult) {
//        // BeanValidationのエラー確認
//        if (bindingResult.hasErrors()) {
//            return "itemCreateForm";
//        }
//
//        // 商品登録処理
//        service.create(itemCreateForm);
//        return "itemCreateComplete";
//    }
//}
