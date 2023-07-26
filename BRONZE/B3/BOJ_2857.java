// BOJ_2857_FBI

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2857 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        for(int i=1;i<=5;i++){
            String str = br.readLine();
            if(str.contains("FBI")){
                result++;
                System.out.print(i+" ");
            }
        }
        /* ==========output========== */
        System.out.print(result==0?"HE GOT AWAY!":"");
        br.close();
    }
}