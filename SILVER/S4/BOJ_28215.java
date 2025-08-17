// BOJ_28215_대피소

import java.io.*;
import java.util.*;

public class BOJ_28215 {
    static int n, k;
    static Point[] houses;
    static int minResult = Integer.MAX_VALUE;

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int getManhattanDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

    public static void findCombination(int start, List<Point> shelters) {
        if (shelters.size() == k) {
            int currentMaxDist = 0;
            for (int i = 0; i < n; i++) {
                int minShelterDist = Integer.MAX_VALUE;
                for (Point shelter : shelters) {
                    minShelterDist = Math.min(minShelterDist, getManhattanDistance(houses[i], shelter));
                }
                currentMaxDist = Math.max(currentMaxDist, minShelterDist);
            }
            minResult = Math.min(minResult, currentMaxDist);
            return;
        }

        for (int i = start; i < n; i++) {
            shelters.add(houses[i]);
            findCombination(i + 1, shelters);
            shelters.remove(shelters.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        houses = new Point[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            houses[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        /* ==========sol========== */
        findCombination(0, new ArrayList<>());
        /* ==========output========== */
        System.out.println(minResult);
        br.close();
    }
}
