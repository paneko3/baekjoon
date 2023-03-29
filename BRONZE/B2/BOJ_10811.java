// BOJ_10811_바구니 뒤집기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N+1];
        for(int k=1;k<=N;k++){
            basket[k]=k;
        }
        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while (i<j){
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }
        }
        /* ==========output========== */
        for(int k=1;k<=N;k++){
            System.out.print(basket[k] + " ");
        }
        br.close();
    }
}
