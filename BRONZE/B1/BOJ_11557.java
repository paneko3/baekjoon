// BOJ_11557_Yangjojang of The Year

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            int max=0;
            String str = "";
            for(int i=0;i<N;i++){
                /* ==========input========== */
                st = new StringTokenizer(br.readLine());
                String S = st.nextToken();
                int L = Integer.parseInt(st.nextToken());
                /* ==========sol========== */
                if(max<L){
                    max=L;
                    str = new String(S);
                }
            }
            /* ==========output========== */
            System.out.println(str);
        }
        br.close();
    }
}