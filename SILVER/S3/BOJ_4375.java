// BOJ_4375_1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while ((str=br.readLine())!=null){
            int N = Integer.parseInt(str);
            int base = 1;
            int count = 1;
            while ((base=base%N)!=0){
                count++;
                base=base*10+1;
            }
            sb.append(count).append("\n");
        }
        /* ==========output========== */
        System.out.println(sb);
        br.close();
    }
}