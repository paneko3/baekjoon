// BOJ_5596_검증수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5596 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = 0;
        int T = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            S+=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            T+=Integer.parseInt(st.nextToken());
        }
        /* ==========output========== */
        System.out.println(Math.max(S,T));
        br.close();
    }
}
