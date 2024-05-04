// BOJ_5704_팬그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Loop:while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("*")){
                break;
            }
            boolean[] arr = new boolean[26];
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)<'a'||str.charAt(i)>'z'){
                    continue ;
                }
                arr[str.charAt(i)-'a']=true;
            }
            for(int i=0;i<26;i++){
                if(!arr[i]){
                    System.out.println("N");
                    continue Loop;
                }
            }
            /* ==========output========== */
            System.out.println("Y");
        }
        br.close();
    }
}