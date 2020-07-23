package cn.nome.day05;

import java.util.Arrays;

public class StudentDemo {
    public static void main(String[] args) {
        Student.room="room1";
        Student stu1 = new Student();
        Student stu2 = new Student("zhongjiandong",36);
        System.out.println("stu1 room is: "+ Student.getRoom() + ",stu1 name is: " + stu1.getName()+", stu1 age is: "
                + stu1.getAge() + ", stu1 id is: " + stu1.getId());
        System.out.println("stu2 room is: "+ Student.getRoom() + ",stu2 name is: " + stu2.getName()+", stu2 age is: "
                + stu2.getAge() + ", stu2 id is: " + stu2.getId());

        String str1="hello";
        String str2="hello";
        String str3= new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
}