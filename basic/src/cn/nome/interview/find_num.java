package cn.nome.interview;

import java.util.Arrays;

public class find_num {
    public static void main(String[] args) {
        /*
        * 求数组中两两相加等于指定数的组合种数
        * */
        int[] arr1 = {2,1,5,3,7,8};
        int[] arr2 = {3,4,5,6,7};

        for (int i = 0; i < arr2.length; i++) {
            findSum2(arr1, arr2[i]);
        }

    }
    /**
     * 排序法
     * 时间复杂度 O(nlogn)
     * @param a
     * @param sum
     */
    public static void findSum2(int[] a,int sum){
        Arrays.sort(a);
        int begin=0;
        int end=a.length-1;
        while(begin<end){
            if (a[begin]+a[end]>sum) {
                end--;
            }else if (a[begin]+a[end]<sum) {
                begin++;
            }else {
                System.out.println(a[begin]+","+a[end]);
                begin++;
                end--;
            }
        }
    }
}
