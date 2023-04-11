// BOJ_14916_거스름돈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14916 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        while (N>0){
            if(N%5==0){
                result += N/5;
                break;
            }
            N -= 2;
            result++;
        }
        /* ==========output========== */
        System.out.println(N>0?result:-1);
        br.close();
    }
}