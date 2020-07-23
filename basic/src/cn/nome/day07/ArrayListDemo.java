package cn.nome.day07;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zjd");
        list.add("zjh");
        System.out.println(list);
        System.out.println(list.get(0));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(14);
        System.out.println(list2);

        int num = list2.get(0);
        System.out.println(num);
    }
}
