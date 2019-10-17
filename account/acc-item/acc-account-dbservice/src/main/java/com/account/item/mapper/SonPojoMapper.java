package com.account.item.mapper;

import com.account.common.mapper.BaseMapper;
import com.account.item.pojo.SonPojo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;


public interface SonPojoMapper extends Mapper<SonPojo> {
    @Update("update tb_son set data = #{data} where title = #{title}")
    boolean UpdateByTitle(@Param("data") String data,@Param("title") String title);


}
