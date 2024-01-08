// BOJ_9550_아이들은 사탕을 좋아해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int k=0;k<T;k++){
            /* ==========input========== */
            /* ==========sol========== */
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int result = 0;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                result+=Integer.parseInt(st.nextToken())/K;
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}