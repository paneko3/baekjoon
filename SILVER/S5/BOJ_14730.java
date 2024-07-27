// BOJ_14730_謎紛芥索紀 (Small)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14730 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            result+=C*K;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}