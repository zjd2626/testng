package cn.nome.day12;

public class MyInterfaceImpl implements InterfaceA,InterfaceB {
    @Override
    public void methodAbs() {
        System.out.println("my");
    }

    @Override
    public void methodDefault1() {
        System.out.println("实现类重写默认方法....");
    }

    @Override
    public void methodB() {

    }
    public static void main(String[] args) {

        System.out.println(InterfaceA.NUM);
        MyInterfaceImpl my = new MyInterfaceImpl();
        my.methodAbs();
        my.methodDefault1();
        my.methodDefault2();

        InterfaceA.methodStatic1();
    }


}
