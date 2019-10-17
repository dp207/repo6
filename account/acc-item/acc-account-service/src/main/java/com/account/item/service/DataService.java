package com.account.item.service;

import com.account.item.mapper.DataPojoMapper;
import com.account.item.mapper.ParentPojoMapper;
import com.account.item.mapper.SonPojoMapper;
import com.account.item.pojo.AllDataPojo;
import com.account.item.pojo.DataPojo;
import com.account.item.pojo.ParentPojo;
import com.account.item.pojo.SonPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    @Autowired
    private ParentPojoMapper parentMapper;
    @Autowired
    private SonPojoMapper sonMapper;
    @Autowired
    private DataPojoMapper dataMapper;
    AllDataPojo allDataPojo=null;
    ParentPojo parentPojo=null;
    SonPojo sonPojo=null;
   // DataPojo dataPojo=null;
    public AllDataPojo getDataByTitle(String name) {
        List<String> titles=new ArrayList<>();
        List<List<String>> maindata=new ArrayList<>();
        allDataPojo = new AllDataPojo();
        parentPojo = new ParentPojo();
        sonPojo=new SonPojo();
        parentPojo.setName(name);
        List<ParentPojo> parents = parentMapper.select(parentPojo);
        ParentPojo parent=parents.get(0);
        sonPojo.setSonId(parent.getParentId());
        List<SonPojo> sons = sonMapper.select(sonPojo);
        for (SonPojo son : sons) {
            titles.add(son.getTitle());
           /* dataPojo=new DataPojo();
            dataPojo.setSonId(son.getSonId());
            dataPojo.setIndexs(son.getIndexs());*/
            String[] messages=son.getData().split(",");
            List<String> lists=new ArrayList<>();
           // List<DataPojo> datas = dataMapper.select(dataPojo);
           /* for (DataPojo data : datas) {
                lists.add(data.getData());
            }*/
            for (String message : messages) {
                lists.add(message);
            }
            maindata.add(lists);
        }
        allDataPojo.setTitleData(titles);
        allDataPojo.setMainData(maindata);
        return allDataPojo;
    }
}
