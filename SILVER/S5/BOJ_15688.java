// BOJ_15688_수_정렬하기_5
import java.io.*;
import java.util.*;

public class BOJ_15688 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        Arrays.sort(arr);

        /* ==========output========== */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < N; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
    }
}
