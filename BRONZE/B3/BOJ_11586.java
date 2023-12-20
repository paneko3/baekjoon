// BOJ_11586_지영 공주님의 마법 거울

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11586 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        /* ==========sol========== */
        /* ==========output========== */
        int K = Integer.parseInt(br.readLine());
        if(K==1){
            for (int i=0;i<N;i++){
                System.out.println(arr[i]);
            }
        }else if(K==2){
            for (int i=0;i<N;i++){
                for(int j=N-1;j>=0;j--){
                    System.out.print(arr[i].charAt(j));
                }
                System.out.println();
            }
        }else if(K==3){
            for (int i=N-1;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
        br.close();
    }
}