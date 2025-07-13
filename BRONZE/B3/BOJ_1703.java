// BOJ_1703_생장점
import java.io.*;
import java.util.*;

public class BOJ_1703 {
    public static void main(String[] args) throws IOException {
        /* ==========input & sol & output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int leaf = 1;

            for (int i = 0; i < a; i++) {
                int split = Integer.parseInt(st.nextToken());
                int cut = Integer.parseInt(st.nextToken());
                leaf = leaf * split - cut;
            }

            System.out.println(leaf);
        }
    }
}
