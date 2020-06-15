/**
 * Given two list of calendar slots calendar a= {{"09:00","10:00"},
 * {"14:00","15:00"}} calendar b= {{"10:00","10:30"}, {"15:00","16:00"}} and
 * both minimum/upper bounds for time where meetings can happen:
 * {"08:00","20:00"} Return all possible slots of time where a meeting of time X
 * could happen. Ex for time=1hour {"10:30","11:30"}
 *
 * Q: Minimun granularity 30min Found at
 * https://www.youtube.com/watch?v=3Q_oYDQ2whs
 */

public class calendarslots {
    public static void main(String[] args) {
        String[][] a = { { "09:00", "10:00" }, { "14:00", "15:00" } };
        String[][] b = { { "10:00", "10:30" }, { "15:00", "16:00" } };
        String[] bounds = { "08:00", "20:00" };
        int i = 0, j = 0, n = 100;
        while (dateminor(addn(bounds[0], n), bounds[1])) { // Still have to add lowerbound check
            String[] tmpslot = { bounds[0], addn(bounds[0], n) };
            if (i < a.length && overlap(tmpslot, a[i])) {
                bounds[0] = a[i][1];
                i++;
                continue;
            } else if (j < b.length && overlap(tmpslot, b[j])) {
                bounds[0] = b[j][1];
                j++;
                continue;
            } else {
                System.out.println("Found one slot at " + tmpslot[0] + "to " + tmpslot[1]);
                bounds[0] = nextslot(bounds[0], 30);
            }
        }

    }

    public static String nextslot(String a, int g) {
        int as = Integer.parseInt(a.replace(":", ""));
        if (as % 100 == 0) {
            return addn(a, g);
        } else {
            return addn(addn(a, -g), 100);
        }
    }

    public static Boolean dateminor(String a, String b) {
        int as = Integer.parseInt(a.replace(":", ""));
        int bs = Integer.parseInt(b.replace(":", ""));
        return (as <= bs);
    }

    public static Boolean overlap(String[] x, String[] y) {
        int x1 = Integer.parseInt(x[0].replace(":", "")); // 930
        int x2 = Integer.parseInt(x[1].replace(":", "")); // 1030

        int y1 = Integer.parseInt(y[0].replace(":", "")); // 900
        int y2 = Integer.parseInt(y[1].replace(":", "")); // 1000
        if ((x2 > y1 && x2 < y2) || (y2 > x1 && y2 < x2) || (y1 > x1 && y1 < x2) || (x1 > y1 && x1 < y2)) {
            return true;
        } else {
            return false;
        }
    }

    public static String addn(String s, int n) { // 1 hour would be n=100
        int x1 = Integer.parseInt(s.replace(":", ""));
        x1 += n;
        String r = Integer.toString(x1);
        if (r.length() < 4) {
            r = "0" + r;
        }
        r = r.substring(0, 2) + ":" + r.substring(2, r.length());
        return r;
    }

}
