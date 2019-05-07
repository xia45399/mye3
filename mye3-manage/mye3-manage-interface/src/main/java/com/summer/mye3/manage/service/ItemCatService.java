package com.summer.mye3.manage.service;

import com.summer.common.pojo.EasyUITreeNode;

import java.util.List;


public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
