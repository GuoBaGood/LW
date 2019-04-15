package com.huxl.fam.mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: Text
 * 作者:huxl_oup
 * 日期:2019/3/7 15:16
 * 描述：
 */
public class Text {
    public static void main(String[] args){
        List<Integer> persons = new ArrayList<>();
        List<Integer> outPersons = new ArrayList<>();
        for (int i=1; i<11; i++){
            persons.add(i);
        }
        //persons.remove(persons.get(2));
        int num = 0;
        int code = 0;
        while (persons.size()>1){
            num ++ ;
            System.out.println(persons.get(code)+":"+num);
            if (num%7==0 || num%10 == 7){
                persons.remove(persons.get(code));
                code--;
            }
            code++;
            if (code>=persons.size()){
                code = 0;
            }
        }
        System.out.println(persons.get(0));


    }
}
