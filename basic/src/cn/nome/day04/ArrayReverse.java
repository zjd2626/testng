package cn.nome.day04;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};

//        for (int i = 0; i < (arr.length/2); i++) {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//
//        printArr(arr);

        arr=arrayReverse(arr);
        printArr(arr);

    }

    public static int[] arrayReverse(int[] arr){
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[arr.length-1-i];
        }
        return newarr;
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
