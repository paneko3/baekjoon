// BOJ_2592_대표값

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2592 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int[] array = new int[1001];
        int count = 0;
        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            array[num]++;
            count = Math.max(count,array[num]);
            result+=num;
        }
        /* ==========output========== */
        System.out.println(result/10);
        for(int i=1;i<=1000;i++){
            if(array[i]==count){
                System.out.println(i);
                break;
            }
        }
        br.close();
    }
}