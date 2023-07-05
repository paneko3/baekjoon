// BOJ_11948_과목선택

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11948 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(arr,0,4);
        Arrays.sort(arr,4,6);
        int result = 0;
        for(int i=1;i<4;i++){
            result+=arr[i];
        }
        result+=arr[5];
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}