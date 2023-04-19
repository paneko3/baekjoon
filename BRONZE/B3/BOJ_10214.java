// BOJ_10214_Baseball

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int test_case=1;test_case<=T;test_case++){
            /* ==========input========== */
            /* ==========sol========== */
            int Y = 0;
            int K = 0;
            for(int i=0;i<9;i++){
                st = new StringTokenizer(br.readLine());
                Y+=Integer.parseInt(st.nextToken());
                K+=Integer.parseInt(st.nextToken());
            }
            /* ==========output========== */
            System.out.println(Y>K?"Yonsei":Y<K?"Korea":"Draw");
        }
        br.close();
    }
}