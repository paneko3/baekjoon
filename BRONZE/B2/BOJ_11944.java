// BOJ_11944_NN

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11944 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            String num = String.valueOf(N);
            for(int j=0;j<num.length();j++){
                if(count>=M){
                    return;
                }
                System.out.print(num.charAt(j));
                count++;
            }
        }
        br.close();
    }
}