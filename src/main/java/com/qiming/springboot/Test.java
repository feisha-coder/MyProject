package com.qiming.springboot;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int []arr = list.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < 2;i++)
            System.out.println(arr[i]);
    }
}
