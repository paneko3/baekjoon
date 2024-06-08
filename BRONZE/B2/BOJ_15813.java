// BOJ_15813_너의 이름은 몇 점이니?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15813 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String name = br.readLine();
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            result+=(name.charAt(i)-'A'+1);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}