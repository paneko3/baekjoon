// BOJ_2776_암기왕

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_2776 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int test_case=0;test_case<T;test_case++){
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Set<Integer> memo = new HashSet<>();
            for(int i=0;i<N;i++){
                int num = Integer.parseInt(st.nextToken());
                memo.add(num);
            }
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++){
                int num = Integer.parseInt(st.nextToken());
                sb.append(memo.contains(num)?1:0).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}