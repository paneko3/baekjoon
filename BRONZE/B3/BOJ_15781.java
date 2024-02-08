// BOJ_15781_헬멧과 조끼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15781 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            max = Math.max(max,Integer.parseInt(st.nextToken()));
        }
        result+=max;
        max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            max = Math.max(max,Integer.parseInt(st.nextToken()));
        }
        result+=max;
        /* ==========output========== */
        System.out.println(result);;
        br.close();
    }
}