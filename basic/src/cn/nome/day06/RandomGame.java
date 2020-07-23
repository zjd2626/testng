package cn.nome.day06;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入你猜测的数字:");
            int guessNum = new Scanner(System.in).nextInt();
            if (guessNum>randomNum){
                if (i<4) System.out.println("太大了,请重试！");
            }else if(guessNum<randomNum ){
                if (i<4) System.out.println("太小了,请重试！");
            }else {
                System.out.println("恭喜你,猜对啦！");
                break;
            }
            if (i==4){
                System.out.println("很遗憾,失败了！");
            }
        }
        System.out.println("游戏结束！");

    }
}
