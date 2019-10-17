package com.account.item.mapper;


import com.account.common.mapper.BaseMapper;
import com.account.item.pojo.DataPojo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

public interface DataPojoMapper extends Mapper<DataPojo> {
    @Update("update tb_data set data = #{data} where son_id = #{son_id} and indexs=#{indexs}")
    Boolean UpdateBysonIdandIndexs(@Param("data") String data,
                                   @Param("son_id") String son_id,
                                   @Param("indexs") String indexs);
}
