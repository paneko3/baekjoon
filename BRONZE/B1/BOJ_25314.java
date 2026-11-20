// BOJ_25314_코딩은 체육과목 입니다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        String result = "";
        for(int i=0;i<N/4;i++){
            result += "long ";
        }
        result += "int";
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
