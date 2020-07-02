package com.company.day01;
/*
    自动类型转换 :
        把一个表示数据范围 小 的数值 或 变量 赋值给一个 表示数值范围 大 的变量
    强制类型转换:
         把一个表示数据范围 大 的数值 或 变量 赋值给一个 表示数值范围 小 的变量
*/
public class TypeChange {
    public  static  void  main(String[] args){
        //自动类型转换
        double num = 10;
        System.out.println(num); //10.0

        // 强制类型转换
        int aa = (int) 666.666;
        System.out.println(aa); //666
    }
}
