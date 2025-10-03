// BOJ_17284_Vending Machine

import java.io.*;
import java.util.*;

public class BOJ_17284 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        int initialMoney = 5000;
        int totalCost = 0;
        
        while (st.hasMoreTokens()) {
            int button = Integer.parseInt(st.nextToken());
            
            if (button == 1) {
                totalCost += 500;
            } else if (button == 2) {
                totalCost += 800;
            } else if (button == 3) {
                totalCost += 1000;
            }
        }
        
        int change = initialMoney - totalCost;

        /* ==========output========== */
        System.out.println(change);
        br.close();
    }
}
