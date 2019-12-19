package com.duanrui.arraypractise.arraydemo2;

import com.duanrui.arraypractise.arraydemo1.ArrayDemo1;
import com.duanrui.arraypractise.arraydemo1.ArrayDemo1.*;

/*
 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
 * 使用for循环或者while循环，对这个数组实现反转效果
 * */
public class ArrayDemo2Test {
    public static void main(String[] args) {
        ArrayDemo1 arraykit = new ArrayDemo1();
        int[] array = arraykit.arrayCreate();//创建长度为5随机数组
        System.out.println("原数组为：");
        arraykit.arrayPrint(array);
        new ArrayDemo2().arrayReverse(array, array.clone());
        System.out.println("反转后的数组为：");
        arraykit.arrayPrint(array);

    }
}
