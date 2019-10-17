package com.account.item.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Table(name = "tb_parent")
public class ParentPojo {

    @Id
    @KeySql(useGeneratedKeys = true)
    @JsonIgnore
    private Integer id;
    private String name;
    private String parentId;
}
