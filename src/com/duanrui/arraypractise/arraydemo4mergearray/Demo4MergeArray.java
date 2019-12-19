package com.duanrui.arraypractise.arraydemo4mergearray;

public class Demo4MergeArray {
    //创建长度为5的随机数组
    //注意，for each不能给数组赋值
    public int[] array5IntCreate() {
        int[] array5 = new int[5];
/*        for (int each : array5) {
            each = (int)(Math.random() * 10);
//            System.out.println(each);
        }*/
        for (int i = 0; i < array5.length; i++) {
            array5[i]=(int)(Math.random() * 10);
        }
        return array5;
    }

    //打印数组
    public void arrayPrint(int[] array1) {
        for (int each : array1) {
            System.out.println(each);
        }
    }

    public void arrayMerge(int[] array1, int[] array2, int[] arrayMerge) {
        System.arraycopy(array1, 0, arrayMerge, 0, 5);
        System.arraycopy(array2, 0, arrayMerge, 5, 5);
    }
}
