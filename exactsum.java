// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

import java.io.*;
import java.util.*;

public class exactsum {
    public static void main(String[] args) {
        Integer[] lista = { 10, 15, 3, 7 };
        Integer k = 17;
        solution_hash(lista, k);
    }

    public static void solution_hash(Integer[] a, Integer k) {
        System.out.println("Solution with hashmap");
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            if (!hashSet.contains(a[i])) {
                hashSet.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (hashSet.contains((k - a[i]))) {
                System.out.println("One combination found with: " + (k - a[i]) + " and " + a[i]);
            }
        }
    }

}