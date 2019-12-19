package com.duanrui.arraypractise.arraydemo4mergearray;

import javax.sound.midi.SoundbankResource;
import javax.xml.transform.Source;

public class Demo4MergeArrayTest {
    public static void main(String[] args) {
        Demo4MergeArray arraykit = new Demo4MergeArray();
        int[] array1 = arraykit.array5IntCreate();
        int[] array2 = arraykit.array5IntCreate();
        System.out.println("创建的两个随机数组为：");
        arraykit.arrayPrint(array1);
        System.out.println("--------------分割线-----------------");
        arraykit.arrayPrint(array2);
        int[] arrayMerge = new int[10];
        System.out.println("合并后的的数组为");
        arraykit.arrayMerge(array1, array2, arrayMerge);
        arraykit.arrayPrint(arrayMerge);
    }
}
