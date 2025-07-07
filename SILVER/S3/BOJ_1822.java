// BOJ_1822_차집합
import java.io.*;
import java.util.*;

public class BOJ_1822 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        TreeSet<Integer> setA = new TreeSet<>();
        HashSet<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nA; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nB; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int x : setA) {
            if (!setB.contains(x)) {
                sb.append(x).append(' ');
                count++;
            }
        }

        /* ==========output========== */
        System.out.println(count);
        if (count > 0) {
            System.out.println(sb);
        }
    }
}
