package com.account.item.mapper;

import com.account.item.pojo.ParentPojo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

public interface ParentPojoMapper extends Mapper<ParentPojo> {

    @Select("select parent_id from tb_parent where name = '${name}'")
    ParentPojo queryParentByName(@Param("name") String name);
    @Insert("insert into tb_parent(name) values(#{name})")
    void saveName(@Param("name") String name);
}
