package com.summer.mye3.content.service;

import com.summer.common.utils.E3Result;
import com.summer.mye3.manage.pojo.TbContent;

import java.util.List;


public interface ContentService {

    E3Result addContent(TbContent content);

    List<TbContent> getContentListByCid(long cid);
}
