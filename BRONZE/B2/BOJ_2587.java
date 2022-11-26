// BOJ_2587_대표값2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2587 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr= new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        /* ==========sol========== */
        Arrays.sort(arr);
        /* ==========output========== */
        System.out.println(sum/5+"\n"+arr[2]);
        br.close();
    }
}
