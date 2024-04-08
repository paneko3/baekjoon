// BOJ_16917_양념 반 후라이드 반

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16917 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int min = Math.min(X,Y);
        int max = Math.max(X,Y);
        int result = Math.min(A*X+B*Y,min*C*2+(X-min)*A+(Y-min)*B);
        result = Math.min(result, max*C*2);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}