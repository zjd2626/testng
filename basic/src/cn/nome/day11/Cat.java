package cn.nome.day11;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼...");
    }

    @Override
    public void talk(){
        System.out.println("猫叫...");
    }
}
