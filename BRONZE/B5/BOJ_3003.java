// BOJ_3003_킹, 퀸, 룩, 비숍, 나이트, 폰

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1,1,2,2,2,8};
        int[] input = new int[6];
        for(int i=0;i<6;i++){
            input[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========output========== */
        for(int i=0;i<6;i++){
            System.out.print((arr[i]-input[i])+" ");
        }
        br.close();
    }
}
