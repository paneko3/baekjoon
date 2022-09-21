// BOJ_10797_10부제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10797 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int result=0;
        for(int i=0;i<5;i++){
            if(Integer.parseInt(st.nextToken())==N){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
