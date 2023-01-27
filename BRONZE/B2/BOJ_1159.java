// BOJ_1159_농구 경기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1159 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[26];
        for(int i=0;i<N;i++){
            array[br.readLine().charAt(0)-'a']++;
        }
        /* ==========sol========== */
        boolean flag =false;
        /* ==========output========== */
        for(int i=0;i<26;i++){
            if(array[i]>=5){
                System.out.print((char)(i+'a'));
                flag=true;
            }
        }
        if(!flag){
            System.out.println("PREDAJA");
        }
        br.close();
    }
}
