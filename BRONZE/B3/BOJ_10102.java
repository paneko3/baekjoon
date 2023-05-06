// BOJ_10102_개표

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10102 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        /* ==========sol========== */
        int A=0;
        int B=0;
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='A'){
                A++;
            }else {
                B++;
            }
        }
        /* ==========output========== */
        System.out.println(A>B?"A":A<B?"B":"Tie");
        br.close();
    }
}