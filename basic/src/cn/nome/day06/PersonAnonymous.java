package cn.nome.day06;

import java.util.Scanner;

public class PersonAnonymous {
    public static void main(String[] args) {
        methodParam(new Scanner(System.in));
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
}
