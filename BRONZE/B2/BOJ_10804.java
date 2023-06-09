// BOJ_10804_카드 역배치

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10804 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[21];
        for(int i=1;i<=20;i++){
            arr[i]=i;
        }
        for(int i=0;i<10;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=0;j<=(b-a)/2;j++){
                int temp = arr[a+j];
                arr[a+j]=arr[b-j];
                arr[b-j]=temp;
            }
        }
        /* ==========output========== */
        for(int i=1;i<=20;i++){
            System.out.print(arr[i]+ " ");
        }
        br.close();
    }
}