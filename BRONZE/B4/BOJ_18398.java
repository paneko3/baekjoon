// BOJ_18398_HOMWRK

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++){
                /* ==========input========== */
                st = new StringTokenizer(br.readLine());
                int A =Integer.parseInt(st.nextToken());
                int B =Integer.parseInt(st.nextToken());
                /* ==========sol========== */
                /* ==========output========== */
                System.out.println((A+B) + " " + A*B);
            }
        }
        br.close();
    }
}