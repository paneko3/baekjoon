// BOJ_1340_연도 진행바

import java.io.*;
import java.util.*;

public class BOJ_1340 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " :,");
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);
        String monthStr = st.nextToken();
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysOfMonth[2] = 29;
        }
        int totalDays = 0;
        for (int i = 1; i <= 12; i++) {
            totalDays += daysOfMonth[i];
        }

        int currentTotalMinutes = 0;
        for (int i = 1; i < map.get(monthStr); i++) {
            currentTotalMinutes += daysOfMonth[i] * 24 * 60;
        }
        currentTotalMinutes += (day - 1) * 24 * 60;
        currentTotalMinutes += hour * 60;
        currentTotalMinutes += minute;

        double totalMinutes = totalDays * 24 * 60;
        double result = (currentTotalMinutes / totalMinutes) * 100;
        /* ==========output========== */
        System.out.printf("%.10f\n", result);
        br.close();
    }
}
