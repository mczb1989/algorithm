package com.zb.algorithm;

/**
 * Created by zhangbin on 2019/1/24.
 */
public class SortUtil {
    public static void printdata(int[] data) {
        for (int k : data) {
            System.out.print(k);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}