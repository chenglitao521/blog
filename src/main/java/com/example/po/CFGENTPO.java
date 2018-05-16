package com.example.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/14 11:03
 */

@Entity
public class CFGENTPO implements Serializable {

    public CFGENTPO() {
    }

    public CFGENTPO(String entName) {
        this.entName = entName;
    }

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
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
