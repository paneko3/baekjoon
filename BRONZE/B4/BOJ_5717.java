// BOJ_5717_상근이의 친구들

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if(M==0&&F==0){
                break;
            }
            /* ==========output========== */
            System.out.println(M+F);
        }
        br.close();
    }
}
