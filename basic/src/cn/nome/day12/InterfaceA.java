package cn.nome.day12;

public interface InterfaceA {
    int NUM = 12;
    public void methodAbs();

    public default void methodDefault1(){
        System.out.println("接口中的默认方法1...");
//        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("接口中的默认方法2...");
//        methodCommon();
    }

//    private void methodCommon(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//    }

    public static void methodStatic1(){
        System.out.println("接口中的静态方法1...");
//        methodStaticCommon();
    }

    public static void methodStatic2(){
        System.out.println("接口中的静态方法2...");
//        methodStaticCommon();
    }

//    private static void methodStaticCommon(){
//        System.out.println("接口中的静态共有方法...");
//    }
}
