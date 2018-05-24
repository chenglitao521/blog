package com.example.service.impl;

import com.example.po.UserInfo;
import com.example.repositories.UserInfoDao;
import com.example.service.IUserInfoService;

import javax.annotation.Resource;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/24 18:25
 */
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
