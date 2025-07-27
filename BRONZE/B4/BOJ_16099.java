// BOJ_16099_Larger Sport Facility

import java.io.*;
import java.util.*;

public class BOJ_16099 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long lt = Long.parseLong(st.nextToken());
            long wt = Long.parseLong(st.nextToken());
            long le = Long.parseLong(st.nextToken());
            long we = Long.parseLong(st.nextToken());
            /* ==========sol========== */
            long areaT = lt * wt;
            long areaE = le * we;
            if (areaT > areaE) {
                result.append("TelecomParisTech\n");
            } else if (areaE > areaT) {
                result.append("Eurecom\n");
            } else {
                result.append("Tie\n");
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
