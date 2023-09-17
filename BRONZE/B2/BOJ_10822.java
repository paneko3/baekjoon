// BOJ_10822_더하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10822 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(",");
        /* ==========sol========== */
        int result = 0;
        for(String s : arr){
            result+=Integer.parseInt(s);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}