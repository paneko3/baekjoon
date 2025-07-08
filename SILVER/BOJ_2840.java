// BOJ_2840_행운의_바퀴
import java.io.*;
import java.util.*;

public class BOJ_2840 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        char[] wheel = new char[N];
        Arrays.fill(wheel, '?');
        boolean[] used = new boolean[26]; // A~Z 사용 여부

        int idx = 0; // 화살표가 가리키는 위치

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);

            // 시계 방향으로 S칸 회전 = 화살표 기준 idx 감소
            idx = ((idx - S) % N + N) % N;

            if (wheel[idx] == '?') {
                if (used[ch - 'A']) {
                    System.out.println("!");
                    return;
                }
                wheel[idx] = ch;
                used[ch - 'A'] = true;
            } else if (wheel[idx] != ch) {
                System.out.println("!");
                return;
            }
        }

        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(wheel[(idx + i) % N]);
        }
        System.out.println(sb);
    }
}
