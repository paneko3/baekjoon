// BOJ_2804_크로스워드 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2804 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        /* ==========sol========== */
        int a = 0;
        int b = 0;
        for(a=0;a<A.length();a++){
            if((b=B.indexOf(A.charAt(a)))!=-1){
                break;
            }
        }
        /* ==========output========== */
        for(int i=0;i<B.length();i++){
            if(i==b){
                System.out.println(A);
                continue;
            }
            for(int j=0;j<A.length();j++){
                System.out.print(j==a?B.charAt(i):".");
            }
            System.out.println();
        }
        br.close();
    }
}