// BOJ_2485_가로수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2485 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int gdc=0;
        for(int i=0;i<N-1;i++){
            gdc=GDC(num[i+1]-num[i],gdc);
        }
        /* ==========output========== */
        System.out.println((num[N-1]-num[0])/gdc+1-N);
        br.close();
    }
    static int GDC(int A, int B){
        if(B==0){
            return A;
        }else {
            return GDC(B,A%B);
        }
    }
}