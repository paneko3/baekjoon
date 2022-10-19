// BOJ_4101_크냐?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            if(A==0&&B==0){
                break;
            }
            /* ==========output========== */
            System.out.println(A>B?"Yes":"No");
        }
        br.close();
    }
}
