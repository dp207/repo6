package com.account;

import org.junit.Test;

import javax.persistence.Table;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
    @Test
    public void test01() {
        String str = "[12,23]";
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(str);
        String pp=null;
        while (matcher.find()){
            pp=matcher.group(1);
        }
        System.out.println(pp);

    }
    public void test02(){

    }
}
