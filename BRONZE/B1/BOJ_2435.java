// BOJ_2435_기상청 인턴 신현수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2435 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result = Integer.MIN_VALUE;
        for(int i=0;i<=N-K;i++){
            int sum = 0;
            for(int j=0;j<K;j++){
                sum+=num[i+j];
            }
            result=Math.max(result,sum);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}