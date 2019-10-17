package com.CQProxy.pojo;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "tb_userInfo")
public class UserInfo {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String username;
    @Ignore
    private String phone;
    @Ignore
    private String email;
    @Ignore
    private String message;
    @Ignore
    private String date;
}
