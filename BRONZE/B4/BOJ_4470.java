// BOJ_4470_줄번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4470 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            String str = br.readLine();
            System.out.println(i + ". " + str);
        }
        br.close();
    }
}