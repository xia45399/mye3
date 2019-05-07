package com.summer.mye3.manage.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.summer.common.pojo.EasyUITreeNode;
import com.summer.mye3.manage.mapper.TbItemCatMapper;
import com.summer.mye3.manage.pojo.TbItemCat;
import com.summer.mye3.manage.pojo.TbItemCatExample;
import com.summer.mye3.manage.service.ItemCatService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 商品分类管理
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	
	@Override
	public List<EasyUITreeNode> getItemCatlist(long parentId) {
		//根据parentId查询子节点列表
		TbItemCatExample example = new TbItemCatExample();
		TbItemCatExample.Criteria criteria = example.createCriteria();
		//设置查询条件
		criteria.andParentIdEqualTo(parentId);
		//执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		//创建返回结果List
		List<EasyUITreeNode> resultList = new ArrayList<>();
		//把列表转换成EasyUITreeNode列表
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			//设置属性
			node.setId(tbItemCat.getId());
			node.setText(tbItemCat.getName());
			node.setState(tbItemCat.getIsParent()?"closed":"open");
			//添加到结果列表
			resultList.add(node);
		}
		//返回结果
		return resultList;
	}

}
