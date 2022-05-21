// BOJ_9184_신나는 함수 실행

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_9184 {
    static int[][][] dp =new int[21][21][21];
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==-1&&b==-1&&c==-1) break;
            StringBuilder sb = new StringBuilder();
            sb.append("w("+a+", "+b+", "+c+") = ");
            sb.append(w(a,b,c));
            System.out.println(sb);
        }
        br.close();
    }
    /* ==========w========== */
    static int w(int a,int b,int c){
        if( a <= 0 || b <= 0 || c <= 0){
            return 1;
        }else if(a > 20 || b > 20 || c > 20){
           return w(20,20,20);
        }else if(dp[a][b][c]!=0){
            return dp[a][b][c];
        } else if(a<b&& b<c){
            return dp[a][b][c]=w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }else {
            return dp[a][b][c]=w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        }
    }
}
