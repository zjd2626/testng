package cn.nome.day02;

public class SwitchDemo {
    public static void main(String[] args) {
        /*
        switch语句注意事项：
        1、switch后面的小括号中只能是以下数据类型：
            基本数据类型：byte,short,char,int
            引用数据类型：String,enum
        2、case后面的值不能重复
         */
        int num = 1;
        switch (num){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("error.");
                break;
        }
    }
}
