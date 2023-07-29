// BOJ_2810_컵홀더

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2810 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        int result = 1;
        for(int i=0;i<N;i++){
            char c = str.charAt(i);
            if(c=='L'){
                i++;
            }
            result++;
        }
        /* ==========output========== */
        System.out.println(result>N?N:result);
        br.close();
    }
}