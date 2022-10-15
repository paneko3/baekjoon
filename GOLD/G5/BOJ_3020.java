// BOJ_3020_개똥벌레

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3020 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int[] top=new int[M+1];
        int[] bottom=new int[M+1];
        for(int i=0;i<N;i++){
            int temp =Integer.parseInt(br.readLine());
            if(i%2==0){
                bottom[temp]++;
            }else {
                top[temp]++;
            }
        }
        /* ==========sol========== */
        for(int i=M-1;i>0;i--){
            bottom[i] +=bottom[i+1];
            top[i]+=top[i+1];
        }
        int min = Integer.MAX_VALUE;
        int count=0;
        for(int i=1;i<=M;i++){
            int total = bottom[i]+top[M-i+1];
            if(min>total)
            {
                min = total;
                count=1;
            }
            else if(min == total) count++;
        }
        /* ==========output========== */
        System.out.println(min + " " + count);
        br.close();
    }
}
