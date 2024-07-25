// BOJ_2980_도로와 신호등

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2980 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        int dis = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            result+=D-dis;
            dis = D;
            if(result%(R+G)<R){
                result+=R-result%(R+G);
            }
        }
        result+=L-dis;
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}