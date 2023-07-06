// BOJ_10093_숫자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10093 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        /* ==========sol========== */
        if(A>B){
            long temp = A;
            A=B;
            B=temp;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A!=B?B-A-1:0).append("\n");
        for(long i=A+1;i<B;i++){
            sb.append(i).append(" ");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}