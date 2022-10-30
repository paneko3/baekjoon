// BOJ_9093_단어 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9093 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                String str = st.nextToken();
                for(int i=0;i<str.length();i++){
                    sb.append(str.charAt(str.length()-i-1));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}
