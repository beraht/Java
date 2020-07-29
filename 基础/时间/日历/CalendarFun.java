package com.study.day12;

import java.util.Calendar;

public class CalendarFun {
    public static void main(String[] args) {
        //获取对象
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int date = cal.get(Calendar.DATE);
        System.out.println(year +"年"+ month + "月" + date + "日"); //2020年7月11日

        cal.add(Calendar.YEAR,+80);  //在当前的基础上再活80年
        cal.add(Calendar.MONTH,+3);  //在当前的基础上再加3个月
        int year1 = cal.get(Calendar.YEAR);
        int month1 = cal.get(Calendar.MONTH)+1;
        int date1 = cal.get(Calendar.DATE);
        System.out.println(year1 +"年"+ month1 + "月" + date1 + "日"); //2020年10月11


        //直接设置时间
        cal.set(2100,10,11);
        int year2 = cal.get(Calendar.YEAR);
        int month2 = cal.get(Calendar.MONTH)+1;
        int date2 = cal.get(Calendar.DATE);
        System.out.println(year2 +"年"+ month2 + "月" + date2 + "日"); //2020年10月11

    }
}
