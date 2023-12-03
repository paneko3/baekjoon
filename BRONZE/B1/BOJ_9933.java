// BOJ_9933_민균이의 비밀번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9933 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            Loop: for(int j=i;j<N;j++){
                String s1 = arr[i];
                String s2 = arr[j];
                if(s1.length()!=s2.length()){
                    continue;
                }
                int len = s1.length();
                for(int k=0;k<len;k++){
                    if(s1.charAt(k)!=s2.charAt(len-1-k)){
                        continue Loop;
                    }
                }
                System.out.println(len + " " + s1.charAt(len/2));
            }
        }
        br.close();
    }
}