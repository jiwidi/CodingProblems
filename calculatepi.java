/**
 * From https://www.youtube.com/watch?v=pvimAM_SLic
 */

public class calculatepi {
    public static void main(String[] args) {
        double n = 0, x1, x2;
        double trys = 1000000.0;
        for (int i = 0; i < trys; i++) {
            x1 = Math.random();
            x2 = Math.random();

            if (Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2)) < 1) {
                n++;
            }
            // Area of a circle = pi*r^2
            // n/1000 = pi*r^2/2r*2r
            // (2r*2r*n/1000)/r^2=pi

        }
        double pi = ((2 * 1 * 2 * 1 * n) / trys) / 1 * 1;
        System.out.println(pi);
    }

}