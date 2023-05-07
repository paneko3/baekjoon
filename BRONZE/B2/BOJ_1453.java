// BOJ_1453_피시방 알바

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1453 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        boolean[] check = new boolean[101];
        int result=0;
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(check[num]){
                result++;
            }else {
                check[num] = true;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}