package com.account.common.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTool {

    public String GetString(String maindata){
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(maindata);
        String result=null;
        if (matcher.find()){
            result=matcher.group(1);
        }
        return result;
    }

}
