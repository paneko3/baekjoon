// BOJ_3062_수 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3062 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            String N = br.readLine();
            /* ==========sol========== */
            StringBuffer sb = new StringBuffer(N);
            String s = String.valueOf(Integer.parseInt(N) + Integer.parseInt(sb.reverse().toString()));
            boolean flag = false;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)==s.charAt(s.length()-1-i)){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
            /* ==========output========== */
            System.out.println(flag?"YES":"NO");
        }
        br.close();
    }
}