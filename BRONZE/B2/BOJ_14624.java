// BOJ_14624_전북대학교

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14624 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N%2==0){
            System.out.println("I LOVE CBNU");
        }else {
            /* ==========sol========== */
            for(int i=0;i<N;i++){
                System.out.print("*");
            }
            N=N/2+1;
            int count1 = N;
            int count2 = N;
            /* ==========output========== */
            System.out.println();
            for(int i=0;i<N;i++){
                for(int j=0;j<count1;j++){
                    System.out.print(j!=count1-1?" ":"*");
                }
                for(int j=count1;j<count2;j++){
                    System.out.print(j!=count2-1?" ":"*");
                }
                System.out.println();
                count1--;
                count2++;
            }
        }
        br.close();
    }
}