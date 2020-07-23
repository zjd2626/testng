package cn.nome.day04;

public class ArrayDemo {
    public static void main(String[] args) {

        //数组动态初始化
        int[] i1 = new int[5];

        //数组静态初始化的标准格式
        String[] s1 = new String[]{"hello","world."};

        //数组静态初始化的省略格式
        String[] s2 = {"hello","world."};
        //数组静态初始化，拆分成2个步骤
        String[] s3;
        s3 = new String[]{"hello","world."};

        //数组静态初始化的省略格式，不能拆分成2个步骤
        //String[] s4;
        //s4 = {"hello","world."};  错误语法
    }
}
