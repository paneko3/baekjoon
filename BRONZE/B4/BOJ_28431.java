// BOJ_28431_양말 짝 맞추기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28431 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        /* ==========sol========== */
        for(int i=0;i<5;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        /* ==========output========== */
        for(int i=0;i<10;i++){
            if(arr[i]%2==1){
                System.out.println(i);
            }
        }
        br.close();
    }
}