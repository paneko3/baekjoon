// BOJ_6236_용돈 관리

import java.io.*;
import java.util.*;

public class BOJ_6236 {
    
    static int N;
    static int M;
    static int[] costs;

    private static int countWithdrawals(int K) {
        int count = 1;
        int currentMoney = K;
        
        for (int dayCost : costs) {
            if (currentMoney < dayCost) {
                count++;
                currentMoney = K; 
            }
            
            currentMoney -= dayCost;
        }
        
        return count;
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        costs = new int[N];
        int maxCost = 0;
        int sumCost = 0;
        
        for (int i = 0; i < N; i++) {
            costs[i] = Integer.parseInt(br.readLine());
            maxCost = Math.max(maxCost, costs[i]);
            sumCost += costs[i];
        }

        /* ==========sol========== */
        
        long low = maxCost;
        long high = sumCost;
        
        long minK = sumCost;
        
        while (low <= high) {
            int midK = (int) ((low + high) / 2);
            
            int requiredWithdrawals = countWithdrawals(midK);
            
            if (requiredWithdrawals <= M) {
                minK = midK;
                high = midK - 1;
            } else {
                low = midK + 1;
            }
        }

        /* ==========output========== */
        System.out.println(minK);
        br.close();
    }
}
