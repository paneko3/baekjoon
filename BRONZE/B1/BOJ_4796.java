// BOJ_4796_캠핑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case=1;
        while (true){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L =Integer.parseInt(st.nextToken());
            int P =Integer.parseInt(st.nextToken());
            int V =Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if(L==0&&P==0&&V==0){
                break;
            }
            /* ==========output========== */
            System.out.println("Case " + test_case++ + ": " + (V/P*L + Math.min(L,V%P)));
        }
        br.close();
    }
}
