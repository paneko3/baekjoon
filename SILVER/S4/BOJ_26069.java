// BOJ_26069_붙임성 좋은 총총이

import java.io.*;
import java.util.*;

public class BOJ_26069 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        /* ==========sol========== */
        HashSet<String> dancers = new HashSet<>();
        dancers.add("ChongChong");
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();
            
            boolean aIsDancing = dancers.contains(A);
            boolean bIsDancing = dancers.contains(B);
            
            if (aIsDancing || bIsDancing) {
                dancers.add(A);
                dancers.add(B);
            }
        }
        
        int result = dancers.size();

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
