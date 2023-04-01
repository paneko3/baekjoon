// BOJ_10448_유레카 이론

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10448 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[50];
        boolean[] check = new boolean[5000];
        for(int i=1;i<50;i++){
            array[i]=i+array[i-1];
        }
        for(int i=1;i<50;i++){
            for(int j=1;j<50;j++){
                for(int k=1;k<50;k++){
                    check[array[i]+array[j]+array[k]]=true;
                }
            }
        }
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int K = Integer.parseInt(br.readLine());
            System.out.println(check[K]?1:0);
        }
        br.close();
    }
}
