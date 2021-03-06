package com.summer.mye3.manage.controller;

import com.summer.common.pojo.EasyUITreeNode;
import com.summer.mye3.manage.service.ItemCatService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * 商品分类管理Controller
 */
@Controller
public class ItemCatController {

    @Reference
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> getItemCatList(
            @RequestParam(name = "id", defaultValue = "0") Long parentId) {
        //调用服务查询节点列表
        List<EasyUITreeNode> list = itemCatService.getItemCatlist(parentId);
        return list;
    }
}
