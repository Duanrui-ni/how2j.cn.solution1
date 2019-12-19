package com.duanrui.arraypractise.arraydemo3sort;

import com.duanrui.arraypractise.arraydemo1.ArrayDemo1;
import com.sun.org.apache.xpath.internal.operations.Or;
/*
 * 1.选择排序
 *
 * */

public class ArrayDemo3Sort {
    ArrayDemo1 arraykitInClass = new ArrayDemo1();

    /*
     **   步骤 1 : 选择法排序顶折
     *    选择法排序的思路：
     *    把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
     *    比较完后，第一位就是最小的
     *    然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
     *    以此类推
     **/
    public int[] chooseSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /*
    *  步骤 2 : 冒泡法排序顶折
    冒泡法排序的思路：
    第一步：从第一位开始，把相邻两位进行比较
    如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
    第二步： 再来一次，只不过不用比较最后一位
    以此类推
    * */
    public int[] bubbleSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

/*    步骤 3 : 练习-排序
    首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
    首先用选择法正排序，然后再对其使用冒泡法倒排序
    注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序*/

    public int[] bubbleSortArray1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /*    增强for循环 求数组中最大值*/
    public int maxArrayReinforceForLoop(int[] array) {
        int maxtemp = array[0];
        for (int each : array) {
            if (maxtemp < each) {
                maxtemp = each;
            }
        }
        return maxtemp;
    }
}