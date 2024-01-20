// BOJ_4766_일반 화학 실험

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4766 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double prev = Double.parseDouble(str);
        while (true){
            /* ==========input========== */
            str = br.readLine();
            /* ==========sol========== */
            if(str.equals("999")){
                break;
            }
            double now = Double.parseDouble(str);
            /* ==========output========== */
            System.out.printf("%.2f",now-prev);
            System.out.println();
            prev = now;
        }
        br.close();
    }
}