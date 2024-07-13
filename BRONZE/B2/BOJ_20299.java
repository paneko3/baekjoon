// BOJ_20299_3대 측정

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20299 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int x3 = Integer.parseInt(st.nextToken());
            if(x1>=L&&x2>=L&&x3>=L&&(x1+x2+x3)>=K){
                result++;
                sb.append(x1+" "+x2+" "+x3+" ");
            }
        }
        /* ==========output========== */
        System.out.println(result);
        System.out.println(sb);
        br.close();
    }
}