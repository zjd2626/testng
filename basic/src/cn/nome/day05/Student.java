package cn.nome.day05;

public class Student {
    public static String room;
    private String name;
    private int age;
    private int id;
    private static int idCouter=0;

    static {
        System.out.println("静态代码块执行了...");
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public Student(){
        System.out.println("无参构造方法调用了。。。。");
        this.id = ++idCouter;
    }

    public Student(String name, int age){
        System.out.println("有参构造方法调用了。。。。");
        this.name=name;
        this.age=age;
        this.id = ++idCouter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId(){
        return id;
    }
}
