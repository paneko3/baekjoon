// BOJ_2875_대회 or 인턴

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2875 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result=0;
        for (int i=0;i<=K;i++){
            int nowN=0;
            int nowM=0;
            int temp = N-i;
            if(temp<=0){
                nowM=M+temp;
            }else {
                nowN= N-i;
                nowM=M-(K-i);
            }
            result=Math.max(result,Math.min(nowN/2,nowM));
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}