// BOJ_10823_더하기 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10823 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String total = "";
        while ((str=br.readLine())!=null){
            total += str;
        }
        /* ==========sol========== */
        int result = 0;
        String[] arr = total.split(",");
        for(String s : arr){
            result+=Integer.parseInt(s);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}