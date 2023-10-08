// BOJ_14490_백대열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14490 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(":");
        /* ==========sol========== */
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        /* ==========output========== */
        System.out.println(n/GCD(n,m)+":"+m/GCD(n,m));
        br.close();
    }
    static int GCD(int a, int b){
        if(b==0){
            return a;
        }else {
            return GCD(b,a%b);
        }
    }
}