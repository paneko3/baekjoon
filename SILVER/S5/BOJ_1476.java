// BOJ_1476_날짜 계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1476 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int e=1;
        int s=1;
        int m=1;
        int result=1;
        while (!(e==E&&s==S&&m==M)){
            e=(e)%15+1;
            s=(s)%28+1;
            m=(m)%19+1;
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
