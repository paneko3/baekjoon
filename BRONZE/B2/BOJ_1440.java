// BOJ_1440_타임머신

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1440 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[3];
        arr[0] = Integer.parseInt(str.substring(0, 2));
        arr[1] = Integer.parseInt(str.substring(3, 5));
        arr[2] = Integer.parseInt(str.substring(6, 8));

        /* ==========sol========== */
        int result = 0;

        for(int i=0;i<3;i++){
            if(arr[i]<1 || arr[i]>12){
                continue;
            }

            for(int j=0;j<3;j++){
                if(i==j){
                    continue;
                }

                int k = 3-i-j;

                if(arr[j]>=0 && arr[j]<=59 && arr[k]>=0 && arr[k]<=59){
                    result++;
                }
            }
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
