// BOJ_19944_뉴비의 기준은 뭘까?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19944 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(M<=N?M==1||M==2?"NEWBIE!":"OLDBIE!":"TLE!");
        br.close();
    }
}