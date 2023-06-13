// BOJ_1145_적어도 대부분의 배수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1145 {
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
        int result=4;
        while (true){
            int count=0;
            for(int i=0;i<5;i++){
                if(result%arr[i]==0){
                    count++;
                }
                if(count>=3){
                    System.out.println(result);
                    return;
                }
            }
            result++;
        }
    }
}