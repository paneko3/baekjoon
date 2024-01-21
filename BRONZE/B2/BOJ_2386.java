// BOJ_2386_도비의 영어 공부

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine();
            /* ==========sol========== */
            if(str.equals("#")){
                break;
            }
            int result = 0;
            char c = str.charAt(0);
            str = str.substring(2).toLowerCase();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==c){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println(c + " " + result);
        }
        br.close();
    }
}