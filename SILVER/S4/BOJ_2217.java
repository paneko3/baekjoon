// BOJ_2217_로프

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2217 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        Integer[] num = new Integer[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(num, Collections.reverseOrder());
        int result = 0;
        for(int i=0;i<N;i++){
            result=Math.max(result,num[i]*(i+1));
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
