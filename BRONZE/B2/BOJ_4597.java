// BOJ_4597_패리티

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            String num = str.substring(0,str.length()-1);
            char c = str.charAt(str.length()-1);
            if(str.equals("#")){
                break;
            }
            int count = 0;
            for(int i=0;i<num.length();i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            /* ==========output========== */
            if((c=='e'&&count%2==0)||(c=='o'&&count%2==1)){
                System.out.println(num+"0");
            }else {
                System.out.println(num+"1");
            }
        }
        br.close();
    }
}