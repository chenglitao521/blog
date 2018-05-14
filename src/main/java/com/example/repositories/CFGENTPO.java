package com.example.repositories;

import java.io.Serializable;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/14 11:03
 */
public class CFGENTPO implements Serializable {
    private Integer id;
    private String entName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }
}
