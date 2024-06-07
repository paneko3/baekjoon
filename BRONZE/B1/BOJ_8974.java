// BOJ_8974_희주의 수학시험

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_8974 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] arr = new int[B+1];
        int num = 1;
        int count = 0;
        for(int i=1;i<=B;i++){
            arr[i]=num;
            count++;
            if(count==num){
                num++;
                count=0;
            }
        }
        int result = 0;
        for(int i=A;i<=B;i++){
            result+=arr[i];
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}