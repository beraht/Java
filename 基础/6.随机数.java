package com.company.day02;
//1.引入包
import java.util.Random;

public class RandomFun {
    public  static  void  main(String[] args){
        //2.创建对象
       Random r  =  new Random();
       //3.产生随机数
        int  i = r.nextInt(10);

        System.out.println(i);
    }
}
