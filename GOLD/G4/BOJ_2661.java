// BOJ_2661_좋은수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2661 {
    static int N;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        back("");
        br.close();
    }
    static void back(String str){
        if(str.length() == N){
            System.out.println(str);
            System.exit(0);
        }
        for(int i=1;i<=3;i++){
            if(check(str+i)){
                back(str+i);
            }
        }
    }
    static boolean check(String str){
        for(int i=1;i<=str.length()/2;i++){
            String front = str.substring(str.length()-i*2,str.length()-i);
            String back = str.substring(str.length()-i,str.length());
            if(front.equals(back)){
                return false;
            }
        }
        return true;
    }
}