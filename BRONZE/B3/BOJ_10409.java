// BOJ_10409_서버

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10409 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            T-=Integer.parseInt(st.nextToken());
            if(T>=0){
                result++;
            }else {
                break;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}