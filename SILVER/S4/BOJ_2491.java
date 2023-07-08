// BOJ_2491_수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2491 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int count = 1;
        int result = 1;
        for(int i=0;i<N-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }else {
                count = 1;
            }
            result=Math.max(result,count);
        }
        count = 1;
        for(int i=0;i<N-1;i++){
            if(arr[i]>=arr[i+1]){
                count++;
            }else {
                count = 1;
            }
            result=Math.max(result,count);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}