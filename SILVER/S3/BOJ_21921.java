// BOJ_21921_블로그

import java.io.*;
import java.util.*;

public class BOJ_21921
{
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int sum = 0;
        for(int i = 0; i < X; i++){
            sum += arr[i];
        }
        int max = sum, count = 1;

        for(int i = X; i < N; i++){
            sum = sum - arr[i - X] + arr[i];

            if(sum > max){
                max = sum;
                count = 1;
            } else if(sum == max){
                count++;
            }
        }

        /* ==========output========== */
        if(max == 0){
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
