package org.sample;

import java.util.List;

public class Sample2After {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 2, 1);
        List<Integer> list2 = List.of(3, 2, 11);
        List<Integer> list3 = List.of(3, 21, 11);
        List<Integer> sumList = List.of(sumList(list1), sumList(list2), sumList(list3));
        System.out.println(sumList);
    }

    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (Integer e : list) {
            sum += e;
        }

        return sum;
    }
}