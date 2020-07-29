package com.study.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFun {
    public static void main(String[] args) throws ParseException {
        //从Date 到  string
        Date d = new Date(); //Sat Jul 11 16:05:38 CST 2020
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH::mm:ss");
        //将日期格式化成日期/时间字符串
        String s =sdf.format(d); //2020-07-11 21::13:56

        //从String 到 Date
        String ss = "2020-07-11 21::13:56";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH::mm:ss");
        Date dd = sdf2.parse(ss);//Sat Jul 11 21:13:56 CST 2020


        String str1 = DateUtils.dateToString(new Date(),"yyyy-MM-dd HH::mm:ss");
        System.out.println(str1);
        Date date = DateUtils.stringToDate("2020-07-11 21::13:56", "yyyy-MM-dd HH::mm:ss");
        System.out.println(date);


    }
}
