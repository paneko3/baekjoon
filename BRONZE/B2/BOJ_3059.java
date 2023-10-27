// BOJ_3059_등장하지 않는 문자의 합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            String S = br.readLine();
            /* ==========sol========== */
            boolean[] check = new boolean[26];
            for(int j=0;j<S.length();j++){
                check[S.charAt(j)-'A']=true;
            }
            int result = 0;
            for(int j=0;j<26;j++){
                if(!check[j]){
                    result+=65+j;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}