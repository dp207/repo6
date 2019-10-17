package com.account.item.pojo;

import lombok.Data;

import java.util.List;

@Data
public class AllDataPojo {

    private List<List<String>> mainData;
    private List<String> titleData;
}
