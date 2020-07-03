package com.company.day02;
/* 1. 导入包*/
import java.util.Scanner;
public class ScannerFun {
    public  static  void  main(String[] args){
        /* 2. 创建Scanner 对象*/
        Scanner sc = new Scanner(System.in);
        /* 3. 接收数据 */
        int i = sc.nextInt(); //将键盘录入的值作为int数据返回
        //输出数据
        System.out.println("i:" + i);
    }
}
