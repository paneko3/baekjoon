// BOJ_1592_영식이와 친구들

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1592 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] count = new int[N+1];
        int result = 0;
        int idx = 1;
        while (true){
            count[idx]++;
            if(count[idx]==M){
                break;
            }
            if(count[idx]%2==0){
                idx=(idx-L)<=0?N-Math.abs(idx-L):idx-L;
            }else {
                idx=(idx+L)>N?(idx+L)%N:idx+L;
            }
            result++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}