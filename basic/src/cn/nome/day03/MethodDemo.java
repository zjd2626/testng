package cn.nome.day03;

public class MethodDemo {
    public static void main(String[] args) {
        sum(10,20);
        printMethod();
    }

    public static int sum(int a,int b){
        int result=a+b;
        return result;
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        return;
    }
}
