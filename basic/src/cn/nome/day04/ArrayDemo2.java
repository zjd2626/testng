package cn.nome.day04;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+2;
            System.out.println(arr1[i]);
        }


    }
}
