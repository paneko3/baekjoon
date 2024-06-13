// BOJ_8892_팰린드롬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8892 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Loop1:for(int t=0;t<T;t++){
            int k = Integer.parseInt(br.readLine());
            String[] arr = new String[k];
            for(int i=0;i<k;i++){
                arr[i]=br.readLine();
            }
            /* ==========sol========== */
            for(int i=0;i<k;i++){
                Loop2:for(int j=0;j<k;j++){
                    if(i==j){
                        continue;
                    }
                    String str = arr[i]+arr[j];
                    for(int l=0;l<str.length()/2;l++){
                        if(str.charAt(l)!=str.charAt(str.length()-1-l)){
                            continue Loop2;
                        }
                    }
                    System.out.println(str);
                    continue Loop1;
                }
            }
            /* ==========output========== */
            System.out.println(0);
        }
        br.close();
    }
}