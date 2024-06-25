// BOJ_1681_줄 세우기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1681 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int count=0;
        int num = 1;
        while (true){
            String s = String.valueOf(num);
            if(s.contains(String.valueOf(L))){
                num++;
                continue;
            }else {
                count++;
            }
            if(count==N){
                break;
            }
            num++;
        }
        /* ==========output========== */
        System.out.println(num);
        br.close();
    }
}