package com.example.repositories;

import com.example.po.UserPo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/8 15:42
 */
@Repository
public class UserRepository {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<UserPo> findAll() {
        logger.debug("debug===================================");
        logger.info("info==================================");
        logger.error("erroe===================================");
        return jdbcTemplate.query("select * from HL_USER", new UserRowMapper());
    }
}
