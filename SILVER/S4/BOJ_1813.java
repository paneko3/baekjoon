// BOJ_1813_논리학 교수

import java.io.*;
import java.util.*;

public class BOJ_1813 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] counts = new int[51];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num <= 50) {
                counts[num]++;
            }
        }
        
        /* ==========sol========== */
        int result = -1;
        for (int i = 50; i >= 0; i--) {
            if (counts[i] == i) {
                result = i;
                break;
            }
        }
        
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
