// BOJ_2437_저울

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2437 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int result = 0;
        for(int i=0;i<N;i++){
            if(result + 1 < num[i]){
                break;
            }
            result += num[i];
        }
        /* ==========output========== */
        System.out.println(result + 1);
        br.close();
    }
}
