// BOJ_30979_유치원생 파댕이 돌보기

import java.io.*;
import java.util.*;

public class BOJ_30979 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); 
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        /* ==========sol========== */
        long totalStopCryTime = 0;
        
        for (int i = 0; i < N; i++) {
            int F = Integer.parseInt(st.nextToken());
            totalStopCryTime += F;
        }

        String result = (totalStopCryTime >= T) ? "Padaeng_i Happy" : "Padaeng_i Cry";

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
