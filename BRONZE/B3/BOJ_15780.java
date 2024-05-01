// BOJ_15780_멀티탭 충분하니?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15780 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<K;i++){
            int num = Integer.parseInt(st.nextToken());
            count += (num+1)/2;
        }
        /* ==========output========== */
        System.out.println(count>=N?"YES":"NO");
        br.close();
    }
}