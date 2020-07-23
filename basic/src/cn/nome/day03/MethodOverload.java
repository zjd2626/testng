package cn.nome.day03;

public class MethodOverload {
    public static void main(String[] args) {
        byte a =1;
        byte b =2;
        same(a,b);
        same((int)a, (int)b);
    }

    public static boolean same(byte a, byte b){
        System.out.println();
        return a==b;
    }

    public static int same(int a, int b){
        return a+b;
    }

}
