// BOJ_1225_이상한 곱셈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1225 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        /* ==========sol========== */
        long result = 0;
        for(int i=0;i<A.length();i++){
            for(int j=0;j<B.length();j++){
                result+=(A.charAt(i)-'0')*(B.charAt(j)-'0');

            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}