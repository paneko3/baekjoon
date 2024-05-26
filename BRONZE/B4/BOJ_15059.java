// BOJ_15059_Hard choice

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15059 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<3;i++){
            int num = Integer.parseInt(st.nextToken());
            result+=arr[i]-num>0?0:num-arr[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}