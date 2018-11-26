package com.summer.service.impl;


import com.summer.mapper.TbItemMapper;
import com.summer.pojo.TbItem;
import com.summer.pojo.TbItemExample;
import com.summer.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 商品管理Service
 *
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {


    @Autowired
    private TbItemMapper itemMapper;

    public TbItem getItemById(long itemId) {
        //根据主键查询
        //TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        //设置查询条件
        criteria.andIdEqualTo(itemId);
        //执行查询
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

}
