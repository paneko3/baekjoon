// BOJ_1598_꼬리를 무는 숫자 나열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1598 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())-1;
        int b = Integer.parseInt(st.nextToken())-1;
        /* ==========sol========== */
        int x1 = a/4;
        int y1 = a%4;
        int x2 = b/4;
        int y2 = b%4;
        int result = Math.abs(x1-x2)+Math.abs(y1-y2);
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}