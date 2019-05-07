package com.summer.mye3.manage.service;


import com.summer.common.pojo.EasyUIDataGridResult;
import com.summer.common.utils.E3Result;
import com.summer.mye3.manage.pojo.TbItem;
import com.summer.mye3.manage.pojo.TbItemDesc;

public interface ItemService {
    TbItem getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page, int rows);

    E3Result addItem(TbItem item, String desc);

    TbItemDesc getItemDescById(long itemId);
}
