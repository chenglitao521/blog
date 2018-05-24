package com.example.service;

import com.example.po.UserInfo;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/24 18:24
 */
public interface IUserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
