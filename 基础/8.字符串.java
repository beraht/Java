package com.study;

public class StringFun {
    public static void main(String[] args) {
        //构造方法  public String() ;创建一个空白字符串的对象,不含任何内容
        String s1 = new String();
        System.out.println("构造方法  public String():" + s1);

        //构造方法  public String(char[] chs) ;根据字符数组的内容,来创建字符串对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("构造方法  public String(char[] chs): " + s2);

        //直接赋值的方式创建字符串对象
        String s3 = "abc";
        System.out.println("直接赋值的方式创建字符串对象: " + s3);

        //字符串是一个类,是一个对象,二个字符串比较的是地址的值
        //  boolean equals​(Object anObject)  将此字符串与指定对象进行比较
         System.out.println("s3 是否等于 s2 : " + s3.equals(s2));


         //遍历字符串的长度
        String s = "生人不敢开口熟人不敢下手没有一见钟情的资本又缺乏日久生情的条件人群中的段子手人群后的单身狗";
            for(int i = 0; i < s.length() ; i++){
                System.out.println(s.charAt(i));
            }

    }
}
