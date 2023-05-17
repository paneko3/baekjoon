// BOJ_9610_사분면

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9610 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] result = new int[5];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x>0&&y>0){
                result[0]++;
            }else if(x<0&&y>0){
                result[1]++;
            }else if(x<0&&y<0){
                result[2]++;
            }else if(x>0&&y<0){
                result[3]++;
            }else {
                result[4]++;
            }
        }
        /* ==========output========== */
        System.out.println("Q1: " + result[0]);
        System.out.println("Q2: " + result[1]);
        System.out.println("Q3: " + result[2]);
        System.out.println("Q4: " + result[3]);
        System.out.println("AXIS: " + result[4]);
        br.close();
    }
}