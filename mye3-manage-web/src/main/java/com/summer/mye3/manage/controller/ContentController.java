package com.summer.mye3.manage.controller;

import com.summer.common.utils.E3Result;
import com.summer.mye3.content.service.ContentService;
import com.summer.mye3.manage.pojo.TbContent;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 内容管理Controller
 * <p>Title: ContentController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@Controller
public class ContentController {

    @Reference
    private ContentService contentService;

    @RequestMapping(value = "/content/save", method = RequestMethod.POST)
    @ResponseBody
    public E3Result addContent(TbContent content) {
        //调用服务把内容数据保存到数据库
        E3Result e3Result = contentService.addContent(content);
        return e3Result;
    }
}
