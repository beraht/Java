package com.study.day11;

public class JumppingDemo {

    public static void main(String[] args) {
        JumppingOperator j = new JumppingOperator();

        Jumpping  cat = new Cat();
        j.method(cat);
        System.out.println("-------------------------");

        j.method(new Jumpping(){
            public void jump(){
                System.out.println("猫咪跳高了");
            }
        });
        j.method(new Jumpping(){
            public void jump(){
                System.out.println("狗狗跳高了");
            }
        });

    }
}
