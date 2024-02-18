// BOJ_17618_신기한 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17618 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<=N;i++){
            String s = String.valueOf(i);
            int sum = 0;
            for(int j=0;j<s.length();j++){
                sum+=s.charAt(j)-'0';
            }
            if(i%sum==0){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}