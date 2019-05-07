package com.summer.mye3.sso.service.impl;

import com.summer.common.jedis.JedisClient;
import com.summer.common.utils.E3Result;
import com.summer.common.utils.JsonUtils;
import com.summer.mye3.sso.service.TokenService;
import com.summer.mye3.manage.pojo.TbUser;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


/**
 * 根据token取用户信息
 * <p>Title: TokenServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 *
 * @version 1.0
 */
@Service
public class TokenServiceImpl implements TokenService {
    // TODO: 2019/5/7 缓存
//    @Autowired
//    private JedisClient jedisClient;
    @Value("${SESSION_EXPIRE}")
    private Integer SESSION_EXPIRE;

    @Override
    public E3Result getUserByToken(String token) {
        //根据token到redis中取用户信息
//        String json = jedisClient.get("SESSION:" + token);
        //取不到用户信息，登录已经过期，返回登录过期
//        if (StringUtils.isBlank(json)) {
            return E3Result.build(201, "用户登录已经过期");
//        }
        //取到用户信息更新token的过期时间
//        jedisClient.expire("SESSION:" + token, SESSION_EXPIRE);
        //返回结果，E3Result其中包含TbUser对象
//        TbUser user = JsonUtils.jsonToPojo(json, TbUser.class);
//        return E3Result.ok(user);
    }

}
