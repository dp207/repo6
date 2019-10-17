package com.account.item.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import java.util.List;

@Data
public class BrandPojo {

    @Id
    @KeySql(useGeneratedKeys = true)
    @JsonIgnore
    private Integer id;
    private String liveTime;
    private String price;
    private String color;
}
