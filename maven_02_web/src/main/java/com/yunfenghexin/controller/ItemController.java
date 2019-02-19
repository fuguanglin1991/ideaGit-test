package com.yunfenghexin.controller;


import com.yunfenghexin.domain.Items;
import com.yunfenghexin.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/itemDetail")
    public String findById(Model model){
        Items item = itemsService.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
