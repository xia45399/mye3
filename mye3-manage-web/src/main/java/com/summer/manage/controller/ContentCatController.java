package com.summer.manage.controller;

import com.summer.common.pojo.EasyUITreeNode;
import com.summer.common.utils.E3Result;
import com.summer.content.service.ContentCategoryService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 内容分类管理Controller
 * <p>Title: ContentCatController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@RestController
@RequestMapping("content")
public class ContentCatController {

    @Reference
    private ContentCategoryService contentCategoryService;

    @RequestMapping("/category/list")
    public List<EasyUITreeNode> getContentCatList(@RequestParam(name = "id", defaultValue = "0") Long parentId) {
        List<EasyUITreeNode> list = contentCategoryService.getContentCatList(parentId);
        return list;
    }

    /**
     * 添加分类节点
     */
    @RequestMapping(value = "/category/create", method = RequestMethod.POST)
    public E3Result createContentCategory(Long parentId, String name) {
        //调用服务添加节点
        E3Result e3Result = contentCategoryService.addContentCategory(parentId, name);
        return e3Result;
    }


}
