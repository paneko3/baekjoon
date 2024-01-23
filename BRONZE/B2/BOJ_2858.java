// BOJ_2858_기숙사 바닥

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2858 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        for(int i=3;i<=5000;i++){
            for(int j=3;j<=5000;j++){
                int r = 2*i+2*j-4;
                int b = i*j-r;
                if(r==R&&B==b){
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }
        br.close();
    }
}