// BOJ_16916_부분 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16916 {
    static int t;
    static int[] table;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        table = new int [P.length()];
        System.out.println(KMP(S,P));
        br.close();
    }
    static int KMP(String s, String p){
        makeTable(p);
        int sLength=s.length();
        int pLength=p.length();
        int idx =0;
        for(int i=0; i<sLength; i++){
            while(idx>0 && s.charAt(i) != p.charAt(idx)){
                idx=table[idx-1];
            }
            if(s.charAt(i)==p.charAt(idx)){
                if(idx==pLength-1){
                    idx=table[idx];
                    return 1;
                }
                else{
                    idx+=1;
                }
            }
        }
        return 0;
    }
    static void makeTable(String p){
        int n = p.length();
        int idx=0;
        for(int i=1; i<n; i++){
            while(idx>0 && p.charAt(i)!=p.charAt(idx)){
                idx= table[idx-1];
            }
            if(p.charAt(i)==p.charAt(idx)){
                idx++;
                table[i]=idx;
            }
        }
    }
}