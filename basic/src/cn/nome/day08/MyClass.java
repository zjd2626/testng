package cn.nome.day08;

public class MyClass {
    private int id;
    private static int idCounter;
    private String name;
    private int age;
    static String room;

    static  {
        System.out.println("静态代码块执行了。");
    }
    public MyClass() {
        System.out.println("无参构造方法执行了。");
    }


    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
        System.out.println("有参构造方法执行了。");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
