package cn.nome.day07;

public class StringMethod {
    public static void main(String[] args) {
        String str = "helloworld";
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);
        System.out.println(str==str3);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3==str4);

        char c = "helloworld".charAt(0);
        System.out.println(c);

        int index = "helloworld".indexOf("llo");
        System.out.println(index);

        char[] chars = "hello".toCharArray();
        System.out.println(chars);

        String str5 = "How do you do?";
        str5 = str5.replace("o", "*");
        System.out.println(str5);

    }
}
