package com.account.item.service;

import com.account.common.enums.ExceptionEnum;
import com.account.common.exception.LyException;
import com.account.common.regular.RegularTool;
import com.account.item.mapper.DataPojoMapper;
import com.account.item.mapper.ParentPojoMapper;
import com.account.item.mapper.SonPojoMapper;
import com.account.item.pojo.AllDataPojo;
import com.account.item.pojo.SonPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Dbservice {


    @Autowired
    private SonPojoMapper sonMapper;
    @Autowired
    private DataPojoMapper dataMapper;
    RegularTool regularTool=null;
    public String UpdateData(AllDataPojo allDataPojo) {
        List<String> titles = allDataPojo.getTitleData();
        List<List<String>> mainDatas = allDataPojo.getMainData();
        System.out.println(mainDatas.get(0)+"[[");
        for(int i=0;i<titles.size();i++){
            regularTool=new RegularTool();
            String maindata=regularTool.GetString(mainDatas.get(i).toString());
            boolean b = sonMapper.UpdateByTitle(maindata,titles.get(i));
            if (b==false){
                throw new LyException(ExceptionEnum.DATA_SAVE_ERROR);
            }
        }
        return "ok";
    }

}
