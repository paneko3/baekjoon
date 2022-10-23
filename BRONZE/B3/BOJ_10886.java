// BOJ_10886_0 = not cute / 1 = cute

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10886 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<N;i++){
            if(Integer.parseInt(br.readLine())==1){
                count++;
            }else {
                count--;
            }
        }
        /* ==========output========== */
        System.out.println(count>=0?"Junhee is cute!":"Junhee is not cute!");
        br.close();
    }
}
