// BOJ_15312_이름 궁합

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15312 {
    static int[] num = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        /* ==========sol========== */
        String AB = "";
        for(int i=0;i<A.length();i++){
            AB+=A.charAt(i);
            AB+=B.charAt(i);
        }
        int[] arr = new int[2*A.length()];
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            arr[i]   = num[A.charAt(i/2) - 'A'];
            arr[i+1] = num[B.charAt(i/2) - 'A'];
        }
        int size = arr.length;
        while (size > 2) {
            for (int i = 0; i < size-1; i++) {
                arr[i] = (arr[i] + arr[i+1]) % 10;
            }
            arr[--size] = 0;
        }
        /* ==========output========== */
        System.out.println(String.valueOf(arr[0])+String.valueOf(arr[1]));
        br.close();
    }
}