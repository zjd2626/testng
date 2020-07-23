package cn.nome.day08;

public class StaticDemo {
    public static void main(String[] args) {
        MyClass.room = "101教室";
        MyClass one = new MyClass("林冲", 18);
        MyClass two = new MyClass("鲁班", 16);

        System.out.println("姓名："+one.getName()+"\t"+"年龄："+one.getAge()+"\t"+"学号："+one.getId());
        System.out.println("姓名："+two.getName()+"\t"+"年龄："+two.getAge()+"\t"+"学号："+two.getId());

    }

}
