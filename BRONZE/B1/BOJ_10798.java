// BOJ_10798_세로읽기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10798 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[5];
        for(int i=0;i<5;i++){
            strings[i]=br.readLine();
        }
        /* ==========output========== */
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(strings[j].length()<=i){
                    continue;
                }
                System.out.print(strings[j].charAt(i));
            }
        }
        br.close();
    }
}
