// BOJ_11179_2진수뒤집기
import java.io.*;

public class BOJ_11179 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(N));
        sb.reverse(); // 2진수 문자열 뒤집기
        int result = Integer.parseInt(sb.toString(), 2); // 다시 10진수로 변환

        /* ==========output========== */
        System.out.println(result);
    }
}
