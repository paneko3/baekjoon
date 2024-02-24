// BOJ_22864_피로도

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_22864 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int count = 0;
        int result = 0;
        for(int i=0;i<24;i++){
            if(count+A<=M){
                count+=A;
                result+=B;
            }else {
                count=count-C>0?count-C:0;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}