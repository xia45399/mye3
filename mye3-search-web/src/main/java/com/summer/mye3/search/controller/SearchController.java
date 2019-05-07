package com.summer.mye3.search.controller;

import com.summer.common.pojo.EasyUIDataGridResult;
import com.summer.common.pojo.SearchItem;
import com.summer.mye3.manage.pojo.TbItem;
import com.summer.mye3.manage.service.ItemService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * 商品搜索Controller
 * <p>Title: SearchController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@Controller
public class SearchController {

    @Reference
    private ItemService itemService;

    @Value("${SEARCH_RESULT_ROWS}")
    private Integer SEARCH_RESULT_ROWS;

    @RequestMapping("test")
    public Object te() {
        return "123";
    }

    @RequestMapping("/search.html")
    public String searchItemList(String keyword, @RequestParam(defaultValue = "1") Integer page, Model model) throws Exception {
        keyword = new String(keyword.getBytes("iso-8859-1"), "utf-8");
        //查询商品列表
        EasyUIDataGridResult list = itemService.getItemList(1, 30);
        //把结果传递给页面
        model.addAttribute("query", keyword);
        model.addAttribute("totalPages", list.getTotal());
        model.addAttribute("page", page);
        model.addAttribute("recourdCount", list.getRows().size());

        List<SearchItem> searchItemList = new ArrayList<SearchItem>();
        for (Object object : list.getRows()) {
            TbItem tbItem = (TbItem) object;
            SearchItem s = new SearchItem();
            s.setId(tbItem.getId() + "");
            s.setCategory_name(tbItem.getCid() + "");
            s.setPrice(tbItem.getPrice());
            s.setTitle(tbItem.getTitle());
            s.setSell_point(tbItem.getSellPoint());
            searchItemList.add(s);
        }
        model.addAttribute("itemList", searchItemList);
        //异常测试
        //int a = 1/0;
        //返回逻辑视图
        return "search";
    }
}
