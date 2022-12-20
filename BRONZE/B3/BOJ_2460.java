// BOJ_2460_지능형 기차 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_2460 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count=0;
        int result=0;
        for(int i=0;i<10;i++){
            st = new StringTokenizer(br.readLine());
            count=count-Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            result=Math.max(result,count);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
