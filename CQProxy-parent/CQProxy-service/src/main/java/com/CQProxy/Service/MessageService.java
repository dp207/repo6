package com.CQProxy.Service;

import com.CQProxy.common.utils.IMoocJSONResult;
import com.CQProxy.common.utils.JsonUtils;
import com.CQProxy.common.utils.PagedResult;
import com.CQProxy.mapper.UserInfoMapper;
import com.CQProxy.pojo.UserInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private UserInfoMapper infoMapper;

    public IMoocJSONResult insertMessage(UserInfo message) {
        System.out.println(message.getUsername());
        if (message==null){
            return IMoocJSONResult.build(202,"输入不能为空",null);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = formatter.format(new Date());
        message.setDate(date);
        int insert = infoMapper.insert(message);
        if (insert==1){
            return IMoocJSONResult.build(200,"提交成功",null);
        }else {
            return IMoocJSONResult.build(202,"提交失败",null);
        }

//        if (StringUtils.isEmpty(message)){
//            return ResponseEntity.status(202).body("数据不能为空2333");
//        }
//        UserInfo userInfo = JsonUtils.jsonToPojo(message, UserInfo.class);
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = formatter.format(new Date());
//        userInfo.setDate(date);
//        int insert = infoMapper.insert(userInfo);
//        if (insert==1){
//            return ResponseEntity.status(200).body("提交成功");
//        }else {
//            return ResponseEntity.status(202).body("提交失败");
//        }


    }

    public IMoocJSONResult getMessage(Integer page,Integer pageSize) {
        if (page==null){
            page=1;
        }
        PageHelper.startPage(page,pageSize);
        List<UserInfo> list = infoMapper.selectAll();
        PageInfo<UserInfo> pageList=new PageInfo<>(list);
        PagedResult pagedResult=new PagedResult();
        pagedResult.setPage(page);
        pagedResult.setTotal(pageList.getPages());
        pagedResult.setRows(list);
        pagedResult.setRecords(pageList.getTotal());
        //return ResponseEntity.status(200).build();
        return IMoocJSONResult.build(200,"ok",pagedResult);


    }
}
