package com.summer.service;


import com.summer.common.pojo.EasyUIDataGridResult;
import com.summer.common.utils.E3Result;
import com.summer.pojo.TbItem;
import com.summer.pojo.TbItemDesc;

public interface ItemService {
    TbItem getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);

    E3Result addItem(TbItem item, String desc);

    TbItemDesc getItemDescById(long itemId);
}
