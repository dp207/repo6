package com.account.common.vo;

import com.account.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em){
        this.status=em.getCode();
        this.message=em.getMsg();
        this.timestamp=System.currentTimeMillis();
    }
    public static ExceptionResult build(int status,String message){

        return new ExceptionResult(status,message,null);
    }
    public static ExceptionResult ok(String message) {
        return new ExceptionResult(message);
    }
    public ExceptionResult(String message){
        this.message=message;
    }

}
