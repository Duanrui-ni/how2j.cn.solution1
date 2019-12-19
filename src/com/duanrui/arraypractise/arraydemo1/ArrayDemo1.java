package com.duanrui.arraypractise.arraydemo1;

public class ArrayDemo1 {
    int temp;

    public int[] arrayCreate() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public int arrayMinElement(int[] array2) {
        temp = array2[0];
        for (int i = 0; i < array2.length - 1; i++) {
            temp = Math.min(temp, array2[i + 1]);
        }
        return temp;
    }

    public void arrayPrint(int[] array) {
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}

