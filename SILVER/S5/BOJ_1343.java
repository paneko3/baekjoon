// BOJ_1343_폴리오미노

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1343 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");
        /* ==========output========== */
        if(str.contains("X")){
            System.out.println(-1);
        }else {
            System.out.println(str);
        }
        br.close();
    }
}