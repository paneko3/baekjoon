// BOJ_14659_한조서열정리하고옴ㅋㅋ

import java.io.*;
import java.util.*;

public class BOJ_14659 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] heights = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int maxKills = 0;
        int currentMaxHeight = heights[0];
        int currentKillCount = 0;
        
        for (int i = 1; i < N; i++) {
            int currentHeight = heights[i];
            
            if (currentHeight < currentMaxHeight) {
                currentKillCount++;
            } 
            else { 
                maxKills = Math.max(maxKills, currentKillCount);
                
                currentMaxHeight = currentHeight;
                
                currentKillCount = 0;
            }
        }
        
        maxKills = Math.max(maxKills, currentKillCount);

        /* ==========output========== */
        System.out.println(maxKills);
        br.close();
    }
}
