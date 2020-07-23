package cn.nome.testng;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String[]> info = new ArrayList<String[]>();
        String info1[] = {"test","123456"};
        String info2[] = {"admin","123456"};
        info.add(info1);
        info.add(info2);

        for (String[] x: info){
            for (String y: x) {
                System.out.print(y + "\t");
            }
            System.out.println("");
        }
    }
}
