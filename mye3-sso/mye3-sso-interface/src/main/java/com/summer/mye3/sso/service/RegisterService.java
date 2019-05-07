package com.summer.mye3.sso.service;


import com.summer.common.utils.E3Result;
import com.summer.mye3.manage.pojo.TbUser;

public interface RegisterService {

    E3Result checkData(String param, int type);

    E3Result register(TbUser user);
}
