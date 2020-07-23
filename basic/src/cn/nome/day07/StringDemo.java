package cn.nome.day07;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = new char[]{'a','b','c'};
        String str3 = new String(charArray);

        //对于引用类型来说, ==是地址值的比较
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        System.out.println("abc".equals(str3));
        System.out.println("====================================");
        System.out.println("Abc".equals(str3));
        System.out.println("Abc".equalsIgnoreCase(str3));
    }
}
