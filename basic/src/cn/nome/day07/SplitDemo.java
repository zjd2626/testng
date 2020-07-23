package cn.nome.day07;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] arr = str.split(",");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
