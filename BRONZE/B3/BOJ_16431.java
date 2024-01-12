// BOJ_16431_베시와 데이지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16431 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Br = Integer.parseInt(st.nextToken());
        int Bc = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Dr = Integer.parseInt(st.nextToken());
        int Dc = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int Jr = Integer.parseInt(st.nextToken());
        int Jc = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int len1 = Math.max(Math.abs(Jr-Br),Math.abs(Jc-Bc));
        int len2 = Math.abs(Jr-Dr)+Math.abs(Jc-Dc);
        /* ==========output========== */
        System.out.println(len1<len2?"bessie":(len1!=len2?"daisy":"tie"));
        br.close();
    }
}