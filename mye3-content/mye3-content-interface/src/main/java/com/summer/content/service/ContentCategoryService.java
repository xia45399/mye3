package com.summer.content.service;

import com.summer.common.pojo.EasyUITreeNode;
import com.summer.common.utils.E3Result;

import java.util.List;


public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCatList(long parentId);

    E3Result addContentCategory(long parentId, String name);
}
