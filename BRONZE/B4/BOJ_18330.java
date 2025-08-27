// BOJ_18330_Petrol

import java.io.*;
import java.util.*;

public class BOJ_18330 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int totalQuota = 60 + k;
        int totalCost;
        if (n <= totalQuota) {
            totalCost = n * 1500;
        } else {
            totalCost = totalQuota * 1500 + (n - totalQuota) * 3000;
        }
        /* ==========output========== */
        System.out.println(totalCost);
        br.close();
    }
}
