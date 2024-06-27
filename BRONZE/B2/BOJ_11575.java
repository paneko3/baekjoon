// BOJ_11575_Affine Cipher

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11575 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<T;t++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String str = br.readLine();
            /* ==========sol========== */
            /* ==========output========== */
            for(int i=0;i<str.length();i++){
                int num = (a*(str.charAt(i)-'A')+b)%26;
                sb.append((char)(num+'A'));
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}