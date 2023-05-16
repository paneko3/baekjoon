// BOJ_25206_너의 평점은

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25206 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        double sum = 0;
        for(int i=0;i<20;i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            double grade = 0;
            String temp = st.nextToken();
            switch (temp){
                case "A+": {
                    grade = 4.5;
                    break;
                }
                case "A0": {
                    grade = 4.0;
                    break;
                }
                case "B+": {
                    grade = 3.5;
                    break;
                }
                case "B0": {
                    grade = 3.0;
                    break;
                }
                case "C+": {
                    grade = 2.5;
                    break;
                }
                case "C0": {
                    grade = 2.0;
                    break;
                }
                case "D+": {
                    grade = 1.5;
                    break;
                }
                case "D0": {
                    grade = 1.0;
                    break;
                }
                case "F": {
                    grade = 0.0;
                    break;
                }
            }
            if(!temp.equals("P")){
                sum+=point;
            }
            result+=point*grade;
        }
        /* ==========output========== */
        System.out.printf("%.6f",result/sum);
        br.close();
    }
}