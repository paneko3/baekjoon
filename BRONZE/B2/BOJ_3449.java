// BOJ_3449_해밍 거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            String A = br.readLine();
            String B = br.readLine();
            /* ==========sol========== */
            int result = 0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)!=B.charAt(i)){
                    result++;
                }
            }
            /* ==========output========== */
            System.out.println("Hamming distance is "+ result + ".");
        }
        br.close();
    }
}