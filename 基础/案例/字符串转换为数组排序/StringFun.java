package com.study.day12;

import java.util.Arrays;

public class StringFun {
    public static void main(String[] args) {
        //创建一个字符串
        String s = "11 66 33 88 22";
        //得到字符串中的每一个数字,存储到int类型的数组中
        String[] strArr = s.split(" "); //返回一个String[]
        //定义一个int数组,将String[]所有的元素遍历到int[]
        int[] intArr = new int[strArr.length];
        for (int i=0;i<strArr.length;i++){
            intArr[i] = Integer.parseInt(strArr[i]);  //字符串转化为int类型
        }
        //排序
        Arrays.sort(intArr);

//        for (int i=0;i<intArr.length;i++){
//            System.out.println(intArr[i]);
//        }

        //把排序后的int[] 重新 拼接成一个字符串
        StringBuilder sreBu = new StringBuilder();
        for (int i=0;i<intArr.length;i++){
            sreBu.append(intArr[i]+" ");
        }

        System.out.println(sreBu.toString());
    }
}
