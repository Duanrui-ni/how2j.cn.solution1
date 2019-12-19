package com.duanrui.arraypractise.arraydemo6twodimensionarray;

/*定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
        找出这个二维数组里，最大的那个值，并打印出其二维坐标*/

public class ArrayDemo6TwoDimensionArrayTest {
    public static void main(String[] args) {
        ArrayDemo6TwoDimensionArray arraykit = new ArrayDemo6TwoDimensionArray();
        int[][] arrayToUse = arraykit.createDimensionArray();
        arraykit.printDimensionArray(arrayToUse);
        int[] coordinate = arraykit.maxElementInArray(arrayToUse);
        System.out.println("二维数组中最大的值为: "+arrayToUse[coordinate[0]][coordinate[1]]);
        System.out.println("二维数组中最大值的坐标为：" + coordinate[0]+" , "+coordinate[1]);
    }
}
