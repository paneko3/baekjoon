// BOJ_5576_콘테스트

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_5576 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] W = new int[10];
        int[] K = new int[10];
        for(int i=0;i<10;i++){
            W[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++){
            K[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(W);
        Arrays.sort(K);
        /* ==========output========== */
        System.out.println((W[9]+W[8]+W[7])+ " "  +(K[9]+K[8]+K[7]));
        br.close();
    }
}