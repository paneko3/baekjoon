// BOJ_1212_8진수 2진수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1212 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        /* ==========sol========== */
        String[] header = {"0","1","10","11","100","101","110","111"};
        String[] body = {"000","001","010","011","100","101","110","111"};
        StringBuilder sb = new StringBuilder();
        sb.append(header[N.charAt(0)-'0']);
        for(int i=1;i<N.length();i++){
            sb.append(body[N.charAt(i)-'0']);
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
