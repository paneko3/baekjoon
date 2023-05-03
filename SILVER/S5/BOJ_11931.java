// BOJ_11931_수 정렬하기 4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_11931 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] num = new Integer[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(num,Collections.reverseOrder());
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for(int n:num){
            sb.append(n).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}