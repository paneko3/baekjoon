// BOJ_9946_단어 퍼즐

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        while (true){
            /* ==========input========== */
            String A = br.readLine();
            String B = br.readLine();
            /* ==========sol========== */
            if(A.equals("END")&&B.equals("END")){
                break;
            }
            int[] arrA = new int[26];
            int[] arrB = new int[26];
            for(int i=0;i<A.length();i++){
                arrA[A.charAt(i)-'a']++;
            }
            for(int i=0;i<B.length();i++){
                arrB[B.charAt(i)-'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(arrA[i]!=arrB[i]){
                    flag=false;
                    break;
                }
            }
            /* ==========output========== */
            System.out.println("Case " + t++ + ": " + (flag?"same":"different"));
        }
        br.close();
    }
}