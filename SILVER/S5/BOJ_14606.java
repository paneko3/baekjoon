// BOJ_14606_피자_Small
import java.io.*;

public class BOJ_14606 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int result = N * (N - 1) / 2;

        /* ==========output========== */
        System.out.println(result);
    }
}
