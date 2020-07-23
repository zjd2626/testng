package cn.nome.day10;

public class Zi extends Fu{

    public Zi(){
        super("zjd");
        System.out.println("helo.");
    }
//    public Zi(){
////        super("zjd");
//        System.out.println("子类构造方法...");
//    }

    @Override
    public void method(){
        System.out.println("子类method方法...");
    }
}
