// BOJ_1371_가장 많은 글자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1371 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str;
        while((str=br.readLine())!=null){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=' '){
                    arr[str.charAt(i)-'a']++;
                }
            }
        }
        /* ==========sol========== */
        int max = 0;
        for(int i=0;i<26;i++){
            max=Math.max(max,arr[i]);
        }
        for(int i=0;i<26;i++){
            if(arr[i]==max){
                System.out.print((char)('a'+i));
            }
        }
        /* ==========output========== */
        br.close();
    }
}