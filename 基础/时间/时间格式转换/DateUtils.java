package com.study.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 *  构造方法私有
 *  成员方法静态
 */
public class DateUtils {
    /**
     * 把日期转为指定格式的字符串  //Sat Jul 11 16:05:38 CST 2020 => 2020  07 11 21  13  56
     * 返回值类型:String
     * 参数:Date date , String format
     */
    public  static  String dateToString(Date date , String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String formatStr = sdf.format(date);
        return formatStr;
    }

    /**
     * 把字符串解析为指定格式的字符串 2020  07 11 21  13  56 =>  Sat Jul 11 16:05:38 CST 2020
     * 返回值类型 : Date
     * 参数: String str , String format
     */
    public static  Date  stringToDate(String str , String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(str);
        return date;
    }
}
