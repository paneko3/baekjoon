// BOJ_17094_Serious Problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17094 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        /* ==========sol========== */
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='2'){
                count1++;
            }else if(str.charAt(i)=='e'){
                count2++;
            }
        }
        /* ==========output========== */
        System.out.println(count1>count2?"2":count1<count2?"e":"yee");
        br.close();
    }
}