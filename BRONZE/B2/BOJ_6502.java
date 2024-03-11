// BOJ_6502_동혁 피자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_6502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 1;
        while (true){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            double r = Double.parseDouble(st.nextToken());
            if(r==0){
                break;
            }
            double w = Double.parseDouble(st.nextToken());
            double l = Double.parseDouble(st.nextToken());
            /* ==========sol========== */
            /* ==========output========== */
            if(r*r<(w/2*w/2 + l/2*l/2)){
                System.out.println("Pizza " + count + " does not fit on the table.");
            }else {
                System.out.println("Pizza " + count + " fits on the table.");
            }
            count++;
        }
        br.close();
    }
}