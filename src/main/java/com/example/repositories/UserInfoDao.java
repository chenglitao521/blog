package com.example.repositories;

import com.example.po.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/24 18:28
 */
public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {
    UserInfo findByUsername(String username);
}
