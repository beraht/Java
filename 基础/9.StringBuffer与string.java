package com.study;

public class StringBufferFun {

    public static void main(String[] args) {

        //1.创建对象 public StringBuffer() 构造方法,构造一个没有字符的字符串缓冲区，初始容量为16个字符。    ​
        StringBuffer strbu = new StringBuffer();
        System.out.println("strbu: " + strbu);

        //1.创建对象 public StringBuffer(String str) 构造方法,构造一个初始化为指定字符串内容的字符串缓冲区
        StringBuffer strbu1 = new StringBuffer("健康平安幸福富贵");
        System.out.println("strbu1: " + strbu1);


        //使用
        strbu.append("健康").append("平安").append("幸福").append("富贵");
        System.out.println("strbu: " + strbu);


        /*
            StringBuffer  转换为 string
            public string toString() 通过toString 就可以实现把StringBuilder 转化为string
        */
          //  String s = strbu;  错误
          String s = strbu.toString();
          System.out.println("s: " + s);
        /*
            string 转换为 StringBuffer
             public StringBuffer(String str) 通过构造方法就可以实现把 string 转化为 StringBuilder
        */


    }
}
