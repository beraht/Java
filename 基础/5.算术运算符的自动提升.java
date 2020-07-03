package com.company.day02;
/*
算术表达式中包含不同的基本数据类型的值的时候，整个算术表达式的类型会自动进行提升。
    字符的 " + "  操作
    char类型参与算术运算，使用的是计算机底层对应的十进制数值。需要我们记住三个字符对应的数值：
        'a' -- 97 a-z是连续的，所以'b'对应的数值是98，'c'是99，依次递加
        'A' -- 65 A-Z是连续的，所以'B'对应的数值是66，'C'是67，依次递加
        '0' -- 48 0-9是连续的，所以'1'对应的数值是49，'2'是50，依次递加
 */
public class YunSuanFu {
    public  static  void  main(String[] args){
        //
        char ch1 = 'a';
        //byte类型，short类型和char类型将被提升到int类型，不管是否有其他类型参与运算
        System.out.println(ch1 + 1); //98
        //整个表达式的类型自动提升到与表达式中最高等级的操作数相同的类型
        //等级顺序：byte,short,char --> int --> long --> float --> double


        byte b1 = 80;
        byte  b2 = 90;
      //byte b3 = b1 + b2;  报错,因为byte类型参与算术运算符提升为int ,int 赋值给byte可能损失精度
        int b3 = b1 + b2;  //byte类型参与算术运算符提升为int,应该用int 接收

        int num1 = 90;
        double num2 = 95.5;
        double num3 = num1 + num2; // int 和 double 运算时, int 会自动提升为double类型,所以用double接收


    }
}
