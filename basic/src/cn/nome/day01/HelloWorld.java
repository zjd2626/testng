package cn.nome.day01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello,world.");
        System.out.println(true);
        System.out.println(false);
        long a = 100L;
        float b = 300000000000.0f;
        System.out.println(b);

        byte num1 = 40;
        byte num2 = 50;
        int num3 = num1 + num2; //byte/short/char都可以发生数学运算，首先会被提升为int类型，再进行运算
        System.out.println(num3);

        int c = 3;
        System.out.println(3 > 4 && ++c ==4); //具有短路效果
        System.out.println(c); //3

        int d;
        d = 3 > 4 ? 4: 3;
        System.out.println(d);

        int aa = 10;
        int bb = 20;
        System.out.println(aa > bb ? aa : bb);

    }
}