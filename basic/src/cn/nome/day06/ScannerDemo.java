package cn.nome.day06;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        String str = sc.next();
        System.out.println(str);
    }
}
