// BOJ_2903_중앙 이동 알고리즘

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2903 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] num = new int[N+1];
        int point = 3;
        for(int i=1;i<=N;i++){
            num[i] = point*point;
            point = 2*point-1;
        }
        /* ==========output========== */
        System.out.println(num[N]);
        br.close();
    }
}