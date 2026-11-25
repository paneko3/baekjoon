// BOJ_23882_알고리즘 수업 - 선택 정렬 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_23882 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* ==========sol========== */
        int count = 0;
        boolean flag = false;

        for(int i=N-1;i>0;i--){
            int max = i;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }

            if(max!=i){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
                count++;

                if(count==K){
                    flag = true;
                    break;
                }
            }
        }

        /* ==========output========== */
        if(flag){
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            System.out.println(-1);
        }

        br.close();
    }
}
