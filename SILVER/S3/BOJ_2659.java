// BOJ_2659_십자카드 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2659 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";
        for(int i=0;i<4;i++){
            str+=st.nextToken().charAt(0);
        }
        int n = cal(Integer.parseInt(str));
        /* ==========sol========== */
        int result = 0;
        for(int i=1111;i<=n;i++){
            if(cal(i)==i){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int cal(int n){
        int temp = n;
        for(int i=0;i<3;i++){
            n = n%1000*10+n/1000;
            temp = Math.min(temp,n);
        }
        return temp;
    }
}