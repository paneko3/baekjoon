// BOJ_11383_뚊

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11383 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=br.readLine();
        }
        /* ==========sol========== */
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                if(str.charAt(2*j)!=arr[i].charAt(j)||str.charAt(2*j+1)!=arr[i].charAt(j)){
                    System.out.println("Not Eyfa");
                    return;
                }
            }
        }
        /* ==========output========== */
        System.out.println("Eyfa");
        br.close();
    }
}