// BOJ_11943_파일 옮기기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11943 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(Math.min(A+D,C+B));
        br.close();
    }
}