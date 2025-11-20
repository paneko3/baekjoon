// BOJ_7795_먹을 것인가 먹힐 것인가

import java.io.*;
import java.util.*;

public class BOJ_7795 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[] A = new int[N];
            int[] B = new int[M];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            
            /* ==========sol========== */
            
            Arrays.sort(A);
            Arrays.sort(B);
            
            long count = 0;
            int ptrB = 0; 
            
            for (int a : A) {
                while (ptrB < M && a > B[ptrB]) {
                    ptrB++;
                }
                
                count += ptrB;
            }
            sb.append(count).append('\n');
        }
        
        /* ==========output========== */
        System.out.print(sb.toString());
        br.close();
    }
}
