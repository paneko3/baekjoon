// BOJ_16693_Pizza Deal

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_16693 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A1 = Double.parseDouble(st.nextToken());
        double P1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double R1 = Double.parseDouble(st.nextToken());
        double P2 = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        System.out.println(A1/P1<(R1*R1*3.14159265359/P2)?"Whole pizza":"Slice of pizza");
        br.close();
    }
}