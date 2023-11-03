// BOJ_1173_운동

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1173 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int result = 0;
        int count = 0;
        int min = m;
        while (count!=N){
            result++;
            if(m+T<=M){
                m+=T;
                count++;
            }else {
                m=m-R<min?min:m-R;
            }
            if((m+T>M)&&(m==min)){
                break;
            }
        }
        /* ==========output========== */
        System.out.println(count==N?result:-1);
        br.close();
    }
}