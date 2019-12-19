package com.duanrui.arraypractise.arraydemo1;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

/*
* 首先创建一个长度是5的数组
然后给数组的每一位赋予随机整数
通过for循环，遍历数组，找出最小的一个值出来
0-100的 随机整数的获取办法有多种，下面是参考办法之一:
(int) (Math.random() * 100)

Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
*
* */
public class ArrayDemo1Test {
    public static void main(String[] args) {
        ArrayDemo1 arraykit = new ArrayDemo1();
        int[] array1 = arraykit.arrayCreate();
        System.out.println("原数组元素是：");
        arraykit.arrayPrint(array1);

        System.out.println("数组的最小值为：" +arraykit.arrayMinElement(array1));
    }

}
