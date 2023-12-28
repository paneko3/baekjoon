// BOJ_5613_계산기 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5613 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());
        while (true){
            char c = br.readLine().charAt(0);
            if(c=='='){
                System.out.println(result);
                break;
            }
            int n = Integer.parseInt(br.readLine());
            switch (c){
                case '+':
                    result+=n;
                    break;
                case '-':
                    result-=n;
                    break;
                case '*':
                    result*=n;
                    break;
                case '/':
                    result/=n;
                    break;
            }
        }
        br.close();
    }
}