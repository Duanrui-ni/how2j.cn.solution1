package com.duanrui.arraypractise.arraydemo3sort;

import com.duanrui.arraypractise.arraydemo1.ArrayDemo1;

public class ArrayDemo3SortTest {
    public static void main(String[] args) {
        ArrayDemo1 arraykit = new ArrayDemo1();
        int[] arrayToSort = arraykit.arrayCreate();
        System.out.println("原数组是：");
        arraykit.arrayPrint(arrayToSort);
 /*       System.out.println("选择排序之后数组是：");
        arraykit.arrayPrint(new ArrayDemo3Sort().chooseSortArray(arrayToSort.clone()));
//        arraykit.arrayPrint(new ArrayDemo3Sort().bubbleSortArray(arrayToSort.clone()));
        System.out.println("选择排序之后冒泡反排序后数组是：");
       arraykit.arrayPrint(new ArrayDemo3Sort().bubbleSortArray1(new ArrayDemo3Sort().chooseSortArray(arrayToSort.clone())));
*/
        System.out.println("数组中最大值为："+new ArrayDemo3Sort().maxArrayReinforceForLoop(arrayToSort.clone()));

    }

}
