package com.summer.controller;


import com.summer.common.pojo.EasyUIDataGridResult;
import com.summer.common.utils.E3Result;
import com.summer.pojo.TbItem;
import com.summer.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 商品管理Controller
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        System.out.println(itemId);
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        //调用服务查询商品列表
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }

    /**
     * 商品添加功能
     */
    @RequestMapping(value="/save", method= RequestMethod.POST)
    @ResponseBody
    public E3Result addItem(TbItem item, String desc) {
        E3Result result = itemService.addItem(item, desc);
        return result;
    }
}
