import java.io.*;
import java.util.*;

public class sort_merge {

    public static void main(String[] args) {
        int[] list = { 0, 9, 4, 9, 9, 9, 90, -90 };
        int[] a = { 1, 2, 6, 9, 5, 7 };
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            System.out.println(Arrays.toString(a));
            // sort(a, m + 1, r);
            // merge(a, l, m, r);
        }

    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            a[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            b[j] = arr[m + 1 + j];

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[i + j] = a[i];
                i++;
            } else {
                arr[i + j] = b[j];
                j++;
            }

        }
        if (i < a.length) {
            for (; i < a.length; i++) {
                arr[i + j] = a[i];
            }
        } else if (j < b.length) {
            for (; j < b.length; j++) {
                arr[i + j] = a[j];
            }
        }
    }
}