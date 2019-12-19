package com.duanrui.arraypractise.arraydemo2;

public class ArrayDemo2 {

    public int[] arrayReverse(int[] array1, int[] array2) {
        for (int i = 0; i < 5; i++) {
            array1[i] = array2[4 - i];
        }
        return array1;
    }

}
