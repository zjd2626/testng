package cn.nome.interview;

import java.util.ArrayList;
import java.util.List;

public class str_demo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3.intern()==str1);

    }

}
