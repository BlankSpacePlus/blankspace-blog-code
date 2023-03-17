package com.blankspace.csdn.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StraightCards {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(13);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        Set<Integer> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 5) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < num; i++) {
            String input = scanner.next();
            if (!map.containsKey(input)) {
                System.out.println("NO");
                return;
            }
            int card = map.get(input);
            if (set.contains(card)) {
                System.out.println("NO");
                return;
            }
            set.add(card);
        }
        scanner.close();
        int prev = 0, counter = 0;
        for (int i : set) {
            if (counter == 0) {
                prev = i;
                counter++;
            } else {
                if (prev == i-1) {
                    prev = i;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

}
