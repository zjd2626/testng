package cn.nome.interview;

public class change_number {
    public static void main(String[] args) {
        int a=-100;
        int b=200;
        a=a^b;
        b=a^b; //b=a^b^b=a
        a=a^b; //a=a^b^a=b
        System.out.println(a);
        System.out.println(b);
    }
}
