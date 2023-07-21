// BOJ_2947_나무 조각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2947 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        while (true){
            boolean flag = false;
            for(int i=0;i<5;i++){
                if(arr[i]!=i+1){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for(int i=0;i<4;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    break;
                }
            }
            for(int n : arr){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        br.close();
    }
}