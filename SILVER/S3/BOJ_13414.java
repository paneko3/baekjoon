// BOJ_13414_수강신청
import java.io.*;
import java.util.*;

public class BOJ_13414 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < L; i++) {
            String id = br.readLine();
            map.put(id, i); // 마지막 클릭 시간으로 덮어씀
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue)); // 클릭 순서대로 정렬

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(K, list.size()); i++) {
            sb.append(list.get(i).getKey()).append("\n");
        }
        System.out.print(sb);
    }
}
