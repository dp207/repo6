package com.account.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {


    DATA_SAVE_ERROR(500,"数据增加失败"),
    GOODS_SAVE_ERROR(500,"新增商品失败"),
    DATA_NULL(500,"数据有空")
    ;
    private int code;
    private String msg;
}
