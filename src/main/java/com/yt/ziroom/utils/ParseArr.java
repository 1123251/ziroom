package com.yt.ziroom.utils;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class ParseArr {
    public List<Integer> parselist(String str){

        String[] strArray = str.substring(1, str.length() - 1).split(",");
        List<Integer> intList = new ArrayList<Integer>();
        for (String s : strArray) {
            if (s != null && !s.trim().equals("null")) {
                intList.add(Integer.parseInt(s.trim()));
            }
        }
        return intList;
    }
}
