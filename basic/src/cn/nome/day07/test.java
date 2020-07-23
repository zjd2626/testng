package cn.nome.day07;

public class test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,7,8};
        int[] arr2 = {3,4,5,6,7};

        for (int i = 0; i < arr1.length; i++) {
            for (int j=i+1; j<arr1.length;j++){
                for (int i1 = 0; i1 < arr2.length; i1++) {
                    if (arr1[i]+arr1[j]==arr2[i1]) {
                        System.out.println(arr1[i]);
                        System.out.println(arr1[j]);
                    }
                }
            }
        }
    }
}
