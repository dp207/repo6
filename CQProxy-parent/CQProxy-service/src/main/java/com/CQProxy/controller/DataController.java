package com.CQProxy.controller;

import com.CQProxy.Service.MessageService;
import com.CQProxy.common.utils.IMoocJSONResult;
import com.CQProxy.common.utils.PagedResult;
import com.CQProxy.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController extends BasicController{

    @Autowired
    private MessageService messageService;

    @RequestMapping("insertMessage")
    public IMoocJSONResult insertMessage(UserInfo message){
        return messageService.insertMessage(message);
    }


    @RequestMapping("getMessage")
    public IMoocJSONResult getMessage(Integer page){
        return messageService.getMessage(page,PAGE_SIZE);
    }
}
