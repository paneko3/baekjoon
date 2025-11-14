// BOJ_2012_등수 매기기

import java.io.*;
import java.util.*;

public class BOJ_2012 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] predictedRanks = new int[N];
        for (int i = 0; i < N; i++) {
            predictedRanks[i] = Integer.parseInt(br.readLine());
        }

        /* ==========sol========== */
        
        Arrays.sort(predictedRanks);
        
        long totalUnhappiness = 0;

        for (int i = 0; i < N; i++) {
            long actualRank = i + 1;
            long predictedRank = predictedRanks[i];
            
            totalUnhappiness += Math.abs(predictedRank - actualRank);
        }

        /* ==========output========== */
        System.out.println(totalUnhappiness);
        br.close();
    }
}
