
/**
 * Given an array {1,2,3,4} return the array that will result of adding 1 to the number represented by the original array, ex: {1,2,3,5}
 */

import java.io.*;
import java.util.*;

class plusonelist {
    public static void main(String[] args) {
        int[] list = { 0, 9, 4, 9, 9, 9 };
        int lastnine = 0;
        int carry = 1;
        int[] result = new int[list.length];
        for (int i = list.length - 1; i >= 0; i--) {
            if (carry == 0) {
                result[i] = list[i];

            } else {
                int sum = list[i] + carry;
                if (sum < 10) {
                    carry = 0;
                }
                result[i] = (list[i] + 1) % 10;

            }
        }
        if (carry == 1) {
            result = new int[list.length];
            result[0] = 1;
        }
        System.out.println(Arrays.toString(result));
    }
}
