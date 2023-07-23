// BOJ_14215_세 막대

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14215 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int max = a>b?(b>c?a:(a>c?a:c)):(b>c?b:c);
        /* ==========output========== */
        System.out.println(a+b+c-max>max?a+b+c:(a+b+c-max)*2-1);
        br.close();
    }
}
