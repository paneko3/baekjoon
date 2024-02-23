// BOJ_14909_양수 개수 세기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14909 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while (st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())>0){
                result++;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}