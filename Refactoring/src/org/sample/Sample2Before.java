package org.sample;

import java.util.List;

public class Sample2Before {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 2, 1);

        // 合計を計算
        int sum1 = 0;
        for (Integer e : list1) {
            sum1 += e;
        }

        List<Integer> list2 = List.of(3, 2, 11);

        int sum2 = 0;
        for (Integer e : list2) {
            sum2 += e;
        }

        List<Integer> list3 = List.of(3, 21, 11);

        int sum3 = 0;
        for (Integer e : list3) {
            sum3 += e;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}