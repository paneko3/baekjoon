// BOJ_7600_문자가 몇갤까

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_7600 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine().toLowerCase();
            /* ==========sol========== */
            if(str.equals("#")){
                break;
            }
            boolean[] arr = new boolean[26];
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                    arr[str.charAt(i)-'a']=true;
                }
            }
            int result = 0;
            for(int i=0;i<26;i++){
                if(arr[i]){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println(result);
        }
        br.close();
    }
}