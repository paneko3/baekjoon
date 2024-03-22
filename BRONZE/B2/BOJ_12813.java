// BOJ_12813_이진수 연산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_12813 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<A.length();i++){
            sb.append((A.charAt(i)-'0')&(B.charAt(i)-'0'));
        }
        sb.append("\n");
        for(int i=0;i<A.length();i++){
            sb.append((A.charAt(i)-'0')|(B.charAt(i)-'0'));
        }
        sb.append("\n");
        for(int i=0;i<A.length();i++){
            sb.append((A.charAt(i)-'0')^(B.charAt(i)-'0'));
        }sb.append("\n");
        for(int i=0;i<A.length();i++){
            sb.append(A.charAt(i)=='0'?"1":"0");
        }sb.append("\n");
        for(int i=0;i<B.length();i++){
            sb.append(B.charAt(i)=='0'?"1":"0");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}