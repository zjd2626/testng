package cn.nome.day07;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i<arr.length-1){
                System.out.print("word"+arr[i]+"#");
            }
            else {
                System.out.println("word"+arr[i]+"]");
            }
        }
    }
}
