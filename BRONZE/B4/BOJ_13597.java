// BOJ_13597_Tri-du

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13597 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        if(A==B){
            System.out.println(A);
        }else {
            System.out.println(Math.max(A,B));
        }
        br.close();
    }
}