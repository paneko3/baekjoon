// BOJ_2506_점수계산

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2506 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count=1;
        for(int i=0;i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            if(temp==1){
                result+=count;
                count++;
            }else {
                count=1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
