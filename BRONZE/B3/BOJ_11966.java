// BOJ_11966_2의 제곱인가?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11966 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        boolean flag = false;
        while (true){
            if(N==1){
                break;
            }
            if(N%2==0){
                N/=2;
            }else {
                flag=true;
                break;
            }
        }
        /* ==========output========== */
        System.out.println(flag?"0":"1");
        br.close();
    }
}