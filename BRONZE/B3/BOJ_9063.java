// BOJ_9063_대지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9063 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[0]=arr[0]==0?x:Math.min(arr[0],x);
            arr[1]=arr[1]==0?x:Math.max(arr[1],x);
            arr[2]=arr[2]==0?y:Math.min(arr[2],y);
            arr[3]=arr[3]==0?y:Math.max(arr[3],y);
        }
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println((arr[1]-arr[0])*(arr[3]-arr[2]));
        br.close();
    }
}