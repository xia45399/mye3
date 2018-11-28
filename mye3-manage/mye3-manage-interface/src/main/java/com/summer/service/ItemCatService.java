package com.summer.service;

import com.summer.common.pojo.EasyUITreeNode;

import java.util.List;


public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
