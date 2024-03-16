// BOJ_3135_라디오

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3135 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());
        int min = Math.abs(A-B);
        for(int i=0;i<N;i++){
            min = Math.min(min, 1+Math.abs(B-Integer.parseInt(br.readLine())));
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(min);
        br.close();
    }
}