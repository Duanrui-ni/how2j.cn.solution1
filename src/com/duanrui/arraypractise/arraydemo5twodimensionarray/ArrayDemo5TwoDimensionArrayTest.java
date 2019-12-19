package com.duanrui.arraypractise.arraydemo5twodimensionarray;

/*定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
        找出这个二维数组里，最大的那个值，并打印出其二维坐标*/

public class ArrayDemo5TwoDimensionArrayTest {
    public static void main(String[] args) {
        ArrayDemo5TwoDimensionArray arraykit = new ArrayDemo5TwoDimensionArray();
        int[][] arrayToUse = arraykit.createDimensionArray();
        arraykit.printDimensionArray(arrayToUse);
        int[] coordinate = arraykit.maxElementInArray(arrayToUse);
        System.out.println("二维数组中最大的值为: "+arrayToUse[coordinate[0]][coordinate[1]]);
        System.out.println("二维数组中最大值的坐标为：" + coordinate[0]+" , "+coordinate[1]);
    }
}
