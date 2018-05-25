package com.example.service.impl;

import com.example.po.UserInfo;
import com.example.repositories.UserInfoDao;
import com.example.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/24 18:25
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
