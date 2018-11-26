package com.summer.controller;


import com.summer.pojo.TbItem;
import com.summer.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理Controller
 *
 * @version 1.0
 */
@Controller
public class ItemController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        System.out.println(itemId);
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }
}
