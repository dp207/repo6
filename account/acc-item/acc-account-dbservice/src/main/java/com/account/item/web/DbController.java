package com.account.item.web;

import com.account.item.pojo.AllDataPojo;
import com.account.item.service.Dbservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    private Dbservice dbservice;
    @PostMapping("updata")
    public ResponseEntity<String> UpdateData(@RequestBody AllDataPojo allDataPojo){
        return ResponseEntity.ok(dbservice.UpdateData(allDataPojo));
    }
    @RequestMapping("LP")
    public String yy(){
        return "gg";
    }
}
