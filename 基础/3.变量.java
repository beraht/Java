package com.company.day01;
/*
    变量定义格式:
        数据类型  变量名  =  变量值
        long类型的变量定义时,为了防止整数过大(默认是int) , 后面加L
        float 类型的变量定义时 ,为了防止类型不兼容(默认类型是double) ,后面加F
*/
public class BianLiang {
    public  static  void  main(String[] args){
        //定义一个变量
        int a = 80;
        //输出变量
        System.out.println("变量的a值为:"+ a);
        //修改变量的值
         a = 100;
        //输出变量
        System.out.println("变量的a修改后的值为:"+ a);
    }
}
