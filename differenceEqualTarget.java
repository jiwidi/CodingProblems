
/**
 * Given an Array of numbers & a target value, return indexes of two numbers
 * such that their Absolute difference is equal to the target
 */

public class differenceEqualTarget {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 5, 10, 100 }; // Assuming is sorted, otherwise we need to short it, if its not shorted
                                              // this will be O(n^2)
        int diff = 90;
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

        }
        System.out.println("no resultados");
    }

}

// Results are O(nlog(n))