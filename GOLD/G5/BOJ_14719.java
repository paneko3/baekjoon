// BOJ_14719_빗물

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14719 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[] num = new int[W];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<W;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result = 0;
        int left = 0;
        int right = 0;
        for(int i=1;i<W-1;i++){
            left=0;
            right=0;
            for(int j=0;j<i;j++){
                left=Math.max(left,num[j]);
            }
            for(int j=i+1;j<W;j++){
                right=Math.max(right,num[j]);
            }
            if(num[i]<left&&num[i]<right){
                result+=Math.min(left,right)-num[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}