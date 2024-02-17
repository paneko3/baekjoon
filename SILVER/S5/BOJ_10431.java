// BOJ_10431_줄세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        for(int p=1;p<=P;p++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int[] arr = new int[20];
            for(int i=0;i<20;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            int result = 0;
            for(int i=1;i<20;i++){
                for(int j=i-1;j>=0;j--){
                    if(arr[j]>arr[i]){
                        result++;
                    }
                }
            }
            /* ==========output========== */
            System.out.println(T+" "+result);
        }
        br.close();
    }
}