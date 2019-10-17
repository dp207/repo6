package com.account.item.web;

import com.account.item.pojo.AllDataPojo;
import com.account.item.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("askdata")
    public ResponseEntity<AllDataPojo> getDataByTitle
            (@RequestParam("getname") String name){
        return ResponseEntity.ok(dataService.getDataByTitle(name));
    }
    @RequestMapping("ttt")
    public String test01(){
        System.out.println("lplpl");
        return "success";
    }
}
