// BOJ_수정필요_추정되는쥐의수
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        int N = (n1 + 1) * (n2 + 1) / (n12 + 1) - 1;

        /* ==========output========== */
        System.out.println(N);
    }
}
