// BOJ_1871_좋은 자동차 번호판

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int t=0;t<N;t++){
            /* ==========input========== */
            StringTokenizer st = new StringTokenizer(br.readLine(),"-");
            /* ==========sol========== */
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            int front = 0;
            for(int i=2;i>=0;i--){
                front+=(str1.charAt(2-i)-'A')*Math.pow(26,i);
            }
            int back = Integer.parseInt(str2);
            int result = Math.abs(front-back);
            /* ==========output========== */
            System.out.println(result<=100?"nice":"not nice");
        }
        br.close();
    }
}