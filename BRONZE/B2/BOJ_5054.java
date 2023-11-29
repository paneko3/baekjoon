// BOJ_5054_주차의 신

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_5054 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            Arrays.sort(arr);
            /* ==========output========== */
            System.out.println(2*(arr[n-1]-arr[0]));
        }

        br.close();
    }
}