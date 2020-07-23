package cn.nome.day07;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("宋雨琦");
        list.add("张翠山");
        list.add("张无忌");

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                System.out.print(list.get(i)+"@");
            }else {
                System.out.println(list.get(i)+"}");
            }
        }
    }
}
