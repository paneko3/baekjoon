// BOJ_2711_오타맨 고창영

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2711 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        /* ==========sol========== */
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0;j<str.length();j++){
                if(j+1==n){
                    continue;
                }
                sb.append(str.charAt(j));
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}