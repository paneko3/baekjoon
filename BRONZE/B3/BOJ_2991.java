// BOJ_2991_사나운 개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            /* ==========input========== */
            int n = Integer.parseInt(st.nextToken());
            /* ==========sol========== */
            int result = 0;
            int num = n%(A+B);
            if(num<=A){
                result++;
            }
            if(num==0){
                result--;
            }
            num = n%(C+D);
            if(num<=C){
                result++;
            }
            if(num==0){
                result--;
            }
            /* ==========output========== */
            System.out.println(result);
        }

        br.close();
    }
}