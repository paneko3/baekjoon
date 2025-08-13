// BOJ_5545_최고의 피자

import java.io.*;
import java.util.*;

public class BOJ_5545 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        
        Integer[] toppings = new Integer[n];
        for (int i = 0; i < n; i++) {
            toppings[i] = Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(toppings, Collections.reverseOrder());

        double maxCaloriePerPrice = (double) c / a;
        int currentPrice = a;
        int currentCalorie = c;

        for (int toppingCalorie : toppings) {
            currentPrice += b;
            currentCalorie += toppingCalorie;
            double newCaloriePerPrice = (double) currentCalorie / currentPrice;
            if (newCaloriePerPrice > maxCaloriePerPrice) {
                maxCaloriePerPrice = newCaloriePerPrice;
            } else {
                break;
            }
        }
        /* ==========output========== */
        System.out.println((int) maxCaloriePerPrice);
        br.close();
    }
}
