// BOJ_11091_알파벳 전부 쓰기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11091 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine().toLowerCase();
            /* ==========sol========== */
            boolean[] check = new boolean[26];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)>='a'&&str.charAt(j)<='z'){
                    check[str.charAt(j)-'a']=true;
                }
            }
            boolean flag = true;
            for(int j=0;j<26;j++){
                if(!check[j]){
                    flag=false;
                    break;
                }
            }
            /* ==========output========== */
            if(flag){
                System.out.println("pangram");
            }else {
                System.out.print("missing ");{
                    for(int j=0;j<26;j++){
                        if(!check[j]){
                            System.out.print((char)('a'+j));
                        }
                    }
                }
                System.out.println();
            }
        }
        br.close();
    }
}