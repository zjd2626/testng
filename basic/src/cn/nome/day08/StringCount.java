package cn.nome.day08;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next();
        countStr(input);
    }
    public static void countStr(String str){
        char[] arr = str.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch =arr[i];
            if ( 'A'<=ch && ch <= 'Z' ){
                countUpper++;
            }else if('a'<=ch && ch <= 'z' ){
                countLower++;
            }else if('0'<=ch && ch <= '9' ){
                countNum++;
            }else {
                countOther++;
            }
         }
        System.out.println("upper:"+countUpper);
        System.out.println("lower:"+countLower);
        System.out.println("number:"+countNum);
        System.out.println("other:"+countOther);
    }
}
