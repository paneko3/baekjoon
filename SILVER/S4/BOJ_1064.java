// BOJ_1064_평행사변형

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1064 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double xA = Double.parseDouble(st.nextToken());
        double yA = Double.parseDouble(st.nextToken());
        double xB = Double.parseDouble(st.nextToken());
        double yB = Double.parseDouble(st.nextToken());
        double xC = Double.parseDouble(st.nextToken());
        double yC = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        if((yB-yA)*(xC-xB)==(xB-xA)*(yC-yB)){
            System.out.println("-1.0");
            return;
        }
        double side1 = Math.sqrt(Math.pow(xA-xB,2)+Math.pow(yA-yB,2));
        double side2 = Math.sqrt(Math.pow(xA-xC,2)+Math.pow(yA-yC,2));
        double side3 = Math.sqrt(Math.pow(xC-xB,2)+Math.pow(yC-yB,2));
        double per1 = side1*2+side2*2;
        double per2 = side1*2+side3*2;
        double per3 = side3*2+side2*2;
        double max = Math.max(per1,Math.max(per2,per3));
        double min = Math.min(per1,Math.min(per2,per3));
        /* ==========output========== */
        System.out.println(max-min);
        br.close();
    }
}