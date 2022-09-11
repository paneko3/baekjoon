// BOJ_2455_지능형 기차

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2455 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int result=0;
        int now=0;
        for(int i=0;i<4;i++){
            st = new StringTokenizer(br.readLine());
            now=now-Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken());
            result=Math.max(result,now);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
