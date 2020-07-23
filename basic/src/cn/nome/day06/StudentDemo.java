package cn.nome.day06;

public class StudentDemo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println(stu1.getName()+" "+ stu1.getAge());
        System.out.println("===========================");
        Student stu2 = new Student("zjd",37);
        System.out.println(stu2.getName()+" "+stu2.getAge());
    }
}
