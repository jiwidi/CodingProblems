
/**
 * Given an Array of numbers & a target value, return indexes of two numbers
 * such that their Absolute difference is the maximum possible
 */

public class absolutedifference {
    public static void main(String[] args) {
        int[] list = { 9, 3, 4, 6, 2, 88, 2, 1, -23 };
        int minn = 0;
        int maxn = 1;
        for (int i = 2; i < list.length; i++) {
            if (list[i] < list[minn]) {
                minn = i;
            } else if (list[i] > list[maxn]) {
                maxn = i;
            }

        }
        System.out.println(minn);
        System.out.println(maxn);
    }

}

// Results are O(n)