package com.duanrui.arraypractise.arraydemo5arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo5Arrays {
    //创建一个二维数组
    public int[][] createBinaryArray() {
        int[][] binaryArray = new int[5][8];
        for (int i = 0; i < binaryArray.length; i++) {
            for (int j = 0; j < binaryArray[i].length; j++) {
                binaryArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return binaryArray;
    }

    //二维数组打印
    public void printBinaryArray(int[][] array) {
/*        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
            System.out.println("");}*/
        for (int[] row : array) {
            for (int each : row) {
                System.out.print(each + ", ");
            }
            System.out.println("");
        }
    }

    //Arrays.sort()排序
    public int[][] sortBinaryArray(int[][] array) {
        int[] toOneDimensionalityArray = new int[40];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, toOneDimensionalityArray, i * 8, array[i].length);
        }
//        System.out.println(Arrays.toString(toOneDimensionalityArray));
        Arrays.sort(toOneDimensionalityArray);
//        System.out.println(Arrays.toString(toOneDimensionalityArray));
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(toOneDimensionalityArray, i * 8, array[i], 0, array[i].length);
        }
        return array;

    }
}
