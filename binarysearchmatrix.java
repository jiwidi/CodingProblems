// Given a matrix that is organised such that the numbers will always be sorted left to right,
// and the first number of each row will always be greater than the last element of the las row(mat[i][0]>mat[i-1][0]),
// search for a specific value in the matrix and return wether it exsts.

public class binarysearchmatrix {
    public static void main(String[] args) {
        Integer[][] mat = { { 1, 2, 3, 4, 5, 6 }, { 7, 12, 14, 15, 16, 17 }, { 19, 20, 21, 22, 23, 24 },
                { 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 34, 36 }, { 37, 38, 39, 40, 41, 42 } };
        int n = 23;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][0] > n) {
                break;
            } else if ((i != mat.length - 1) && (mat[i + 1][0] > n)) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == n) {
                        System.out.println("Found");
                        return;
                    }
                    break;
                }
            } else if (i == mat.length - 1) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == n) {
                        System.out.println("Found");
                        return;
                    }
                }
                break;
            }

        }
        System.out.println("Not found");
    }
}