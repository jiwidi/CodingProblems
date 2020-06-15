
/**
 * Given an Array of numbers & a target value, return indexes of two numbers
 * such that their Absolute difference is equal to the target
 */
import java.io.*;
import java.util.*;

public class differenceEqualTarget {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 5, 10, 100 }; // Assuming is sorted, otherwise we need to short it, if its not shorted
                                              // this will be O(n^2)
        int diff = 90;
        sol1(list, diff);
        sol2(list, diff);
    }

    public static void sol1(int[] list, int diff) {
        System.out.println("Solution 1:");
        int tmpdiff = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                tmpdiff = Math.abs(list[i] - list[j]);
                if (tmpdiff > diff) {
                    break;
                } else if (tmpdiff == diff) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
            // O(nlogn)
        }
    }

    public static void sol2(int[] list, int diff) {
        System.out.println("Solution 2:");
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            if (!hashSet.contains(list[i])) {
                hashSet.add(list[i]);
            }
        }
        int pos1, pos2;
        for (int i = 0; i < list.length; i++) {
            pos1 = list[i] + diff;
            pos2 = list[i] - diff;
            if (hashSet.contains(pos1) || hashSet.contains(pos2)) {
                System.out.println(i);
                for (int j = 0; j < list.length; j++) {
                    if (list[j] == pos1 || list[j] == pos2) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
        // O(n) best case, O(n^2) worst case with bad hashes

    }

}

// Results are O(nlog(n))