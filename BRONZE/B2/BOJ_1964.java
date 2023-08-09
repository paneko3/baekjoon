// BOJ_1964_오각형, 오각형, 오각형…

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1964 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 1;
        for(int i=1;i<=N;i++){
            result=(result+3*i+1)%45678;
        }
        System.out.println(result);
        /* ==========output========== */
        br.close();
    }
}