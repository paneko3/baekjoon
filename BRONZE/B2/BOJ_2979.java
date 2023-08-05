// BOJ_2979_트럭 주차

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2979 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] time = new int[100];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a;j<b;j++){
                time[j]++;
            }
        }
        /* ==========sol========== */
        int result = 0;
        for(int i=1;i<100;i++) {
            if (time[i] == 1) {
                result += A;
            } else if (time[i] == 2) {
                result += B*2;
            } else if (time[i] == 3) {
                result += C*3;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}