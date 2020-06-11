import java.io.*;
import java.util.*;

// Exercise from https://www.youtube.com/watch?v=5o-kdjv7FD0
public class recursivestaircase {
    public static void main(String[] args) {
        System.out.println(how_many(5));
        Integer[] set = { 1, 3 };
        System.out.println(how_many_set(5, set));
    }

    public static Integer how_many(Integer n) {
        /**
         * How many ways of going thought the staircase with set {1,2}
         */
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return how_many(n - 1) + how_many(n - 2);
        }

    }

    public static Integer how_many_set(Integer n, Integer[] set) {
        if (n == 0) {
            return 1;
        }
        int u = 0, r = 0;
        List<Integer> tmplist = new ArrayList<Integer>();
        for (int i = 0; i < set.length; i++) {
            if (n - set[i] >= 0) {
                tmplist.add(n - set[i]);
            }
        }
        for (Integer item : tmplist) {
            r += how_many_set(item, set);
        }
        return r;
    }

}

// SImilar python code I did first to understand it better
// def main(n=5):
// print(num_ways(5))
// print(num_waysX(5, [1, 3]))

// def num_ways(n):
// if n == 1 or n == 0:
// return 1
// else:
// solutions = num_ways(n - 1) + num_ways(n - 2)
// return solutions

// def num_waysX(n, set):
// if n == 0:
// return 1
// r = [num_waysX(n - u, set) for u in set if ((n - u) >= 0)]
// return sum(r)

// if __name__ == "__main__":
// main()
