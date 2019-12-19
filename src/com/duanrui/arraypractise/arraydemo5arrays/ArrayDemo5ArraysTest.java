package com.duanrui.arraypractise.arraydemo5arrays;

import java.util.Arrays;
public class ArrayDemo5ArraysTest {
    public static void main(String[] args) {
        ArrayDemo5Arrays arraykit = new ArrayDemo5Arrays();
        //boolean equals(int[] a,int[] b) 判断两个数组是否相等。
        int [] array1 = new int[]{3,9,4,0,6};
        int [] array2 = new int[]{4,5,6,7,3};
        boolean result = Arrays.equals(array1,array2);
        System.out.println(result);

        //String toString(int[] a) 输出数组信息
        System.out.println(Arrays.toString(array1));

/*        //void fill(int[] a,int val)将指定值填充到数组之中
        Arrays.fill(array1,3);
        System.out.println(Arrays.toString(array1));*/

        //void sort(int[] a) 对数组进行排序
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        //int binarySearch(int[] a,int key)对排序后的数组进行二分法检索指定的值
        int[]array3 = new int[]{1,2,3,17,90};
        int index = Arrays.binarySearch(array3,17);
        System.out.println(index);

        //Array.copyOfRange复制数组
        int[]array5 = new int[]{3,18,5,7,5};
        int[] array6 = Arrays.copyOfRange(array5,0,5);
        System.out.println(Arrays.toString(array6));

        //排序
        Arrays.sort(array6);
        System.out.println(Arrays.toString(array6));

        //查找
        System.out.println(Arrays.binarySearch(array6,18));

        //对比
        System.out.println(Arrays.equals(array5,array6));

        //填充
        Arrays.fill(array5,7);
        System.out.println(Arrays.toString(array5));

        //二维数组排序
        int[][] binaryArrayToUse = new int[5][];
        binaryArrayToUse = arraykit.createBinaryArray();
        arraykit.printBinaryArray(binaryArrayToUse);
        System.out.println("--------------------分割线--------------------");
        //System.out.println(binaryArrayToUse[0].length);
        arraykit.printBinaryArray(arraykit.sortBinaryArray(binaryArrayToUse));




    }
}
