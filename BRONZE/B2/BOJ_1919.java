// BOJ_1919_애너그램 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1919 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        /* ==========sol========== */
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i=0;i<str1.length();i++){
            count1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            count2[str2.charAt(i)-'a']++;
        }
        int result=str1.length()+str2.length();
        for(int i=0;i<26;i++){
            result-=2*Math.min(count1[i],count2[i]);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}