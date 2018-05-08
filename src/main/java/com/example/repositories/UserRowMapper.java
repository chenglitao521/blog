package com.example.repositories;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/8 15:47
 */
 public class UserRowMapper implements RowMapper<UserPo> {

    @Override
    public UserPo mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserPo user = new UserPo();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));


        return user;
    }

}