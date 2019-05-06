package com.summer.content.service;

import com.summer.common.utils.E3Result;
import com.summer.manage.pojo.TbContent;

import java.util.List;


public interface ContentService {

    E3Result addContent(TbContent content);

    List<TbContent> getContentListByCid(long cid);
}
