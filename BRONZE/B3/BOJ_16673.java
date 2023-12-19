// BOJ_16673_고려대학교에는 공식 와인이 있다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16673 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=C;i++){
            result+=K*i+P*i*i;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}