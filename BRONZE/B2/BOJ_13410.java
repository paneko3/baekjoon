// BOJ_13410_거꾸로 구구단

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13410 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int num = N;
        int result = 0;
        for(int i=0;i<K;i++){
            String str = String.valueOf(num);
            String temp = "";
            for(int j=str.length()-1;j>=0;j--){
                temp += str.charAt(j);
            }
            result = Math.max(result, Integer.parseInt(temp));
            num+=N;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}