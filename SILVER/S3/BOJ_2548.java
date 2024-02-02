// BOJ_2548_대표 자연수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2548 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] cnt = new int[10001];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            cnt[Integer.parseInt(st.nextToken())]++;
        }
        /* ==========sol========== */
        int temp = 0;
        int mid = (N-1)/2;
        /* ==========output========== */
        for(int i=1;i<=10000;i++){
            temp+=cnt[i];
            if(temp>mid){
                System.out.println(i);
                return;
            }
        }
        br.close();
    }
}