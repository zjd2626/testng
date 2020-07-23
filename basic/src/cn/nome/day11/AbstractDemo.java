package cn.nome.day11;

import java.text.DecimalFormat;

public class AbstractDemo {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.eat();
        tom.talk();
        double a=10.0;
        double result=(double)(Math.round((a/3)*100))/100;
        System.out.println(result);

        double price=3.333333;
        DecimalFormat df = new DecimalFormat(".00");
        String p=df.format(price);
        System.out.println(p);

    }
}
