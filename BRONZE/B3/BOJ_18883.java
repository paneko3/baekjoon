// BOJ_18883_N M 찍기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18883 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                sb.append(count++);
                if(j!=M){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        /* ==========output========== */
        System.out.print(sb);
        br.close();
    }
}