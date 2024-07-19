// BOJ_12780_원피스

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_12780 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String H = br.readLine();
        String N = br.readLine();
        /* ==========sol========== */
        int result = 0;
        int idx = 0;
        while (idx<H.length()){
            if(H.charAt(idx)==N.charAt(0)){
                boolean flag = true;
                for(int i=1;i<N.length();i++){
                    if(idx+i>=H.length()){
                        flag=false;
                        break;
                    }
                    if(H.charAt(idx+i)!=N.charAt(i)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    result++;
                }
            }
            idx++;
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}