// BOJ_17087_숨바꼭질 6

import java.io.*;
import java.util.*;

public class BOJ_17087 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        /* ==========sol========== */
        int[] distances = new int[N];
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            distances[i] = Math.abs(A - S);
        }
        int resultGCD = distances[0];
        
        for (int i = 1; i < N; i++) {
            resultGCD = gcd(resultGCD, distances[i]);
        }

        /* ==========output========== */
       System.out.println(resultGCD);
        br.close();
    }
}
