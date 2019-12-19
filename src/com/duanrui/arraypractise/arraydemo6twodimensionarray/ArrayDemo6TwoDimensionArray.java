package com.duanrui.arraypractise.arraydemo6twodimensionarray;

public class ArrayDemo6TwoDimensionArray {
    //创建一个二维数组
    public int[][] createDimensionArray() {
        int[][] array = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }

        }
        return array;
    }

    //打印创建的二维数组
    public void printDimensionArray(int[][] array) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("");
        }
    }

    //找出二维数组中最大数，返回坐标
    public int[] maxElementInArray(int[][] array) {
        int tempMax = array[0][0];
        int[] coordinate = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (tempMax < array[i][j]) {
                    tempMax = array[i][j];
                    coordinate[0] = i;
                    coordinate[1] = j;
                }

            }
        }
        return coordinate;
    }
}
