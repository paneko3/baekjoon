// BOJ_1768_Center of symmetry

import java.util.*;

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }
}

public class BOJ_1768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* ==========input========== */
        if (!sc.hasNextInt()) return;
        int c = sc.nextInt();

        while (c-- > 0) {
            int n = sc.nextInt();
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                points[i] = new Point(sc.nextInt(), sc.nextInt());
            }

            /* ==========sol========== */
            Arrays.sort(points);

            int targetX = points[0].x + points[n - 1].x;
            int targetY = points[0].y + points[n - 1].y;

            boolean isSymmetric = true;
            for (int i = 0; i <= n / 2; i++) {
                if (points[i].x + points[n - 1 - i].x != targetX || 
                    points[i].y + points[n - 1 - i].y != targetY) {
                    isSymmetric = false;
                    break;
                }
            }

            /* ==========output========== */
            System.out.println(isSymmetric ? "yes" : "no");
        }
        sc.close();
    }
}
