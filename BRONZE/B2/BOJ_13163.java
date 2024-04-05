// BOJ_13163_닉네임에 갓 붙이기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_13163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            String[] tokens = str.split(" ");
            String result = "god";
            for(int j=1;j<tokens.length;j++){
                result+=tokens[j];
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}