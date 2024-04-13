// BOJ_5612_터널의 입구와 출구

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5612 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = m;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            m+=Integer.parseInt(st.nextToken());
            m-=Integer.parseInt(st.nextToken());
            if(m<0){
                result=0;
                break;
            }
            result=Math.max(result,m);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}