// BOJ_5355_화성 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            double N = Double.parseDouble(st.nextToken());
            /* ==========sol========== */
            while (st.hasMoreTokens()){
                String op = st.nextToken();
                if(op.equals("@")){
                    N*=3;
                }else if(op.equals("%")){
                    N+=5;
                }else if(op.equals("#")){
                    N-=7;
                }
            }
            /* ==========output========== */
            System.out.printf("%.2f",N);
            System.out.println();
        }
        br.close();
    }
}
