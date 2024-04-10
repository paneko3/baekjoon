// BOJ_20361_일우는 야바위꾼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20361 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        boolean[] cup = new boolean[N+1];
        cup[X]=true;
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            boolean temp = cup[A];
            cup[A]=cup[B];
            cup[B]=temp;
        }
        /* ==========output========== */
        for(int i=1;i<=N;i++){
            if(cup[i]){
                System.out.println(i);
                break;
            }
        }
        br.close();
    }
}