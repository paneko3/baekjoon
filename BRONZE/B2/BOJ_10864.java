// BOJ_10864_친구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10864 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] arr = new int[N+1];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken())]++;
            arr[Integer.parseInt(st.nextToken())]++;
        }
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}