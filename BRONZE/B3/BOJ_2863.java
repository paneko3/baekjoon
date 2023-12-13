// BOJ_2863_이게 분수?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2863 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double C = Double.parseDouble(st.nextToken());
        double D = Double.parseDouble(st.nextToken());
        /* ==========sol========== */
        double[] arr = new double[4];
        arr[0] = A/C + B/D;
        arr[1] = C/D + A/B;
        arr[2] = D/B + C/A;
        arr[3] = B/A + D/C;
        double max = 0;
        int result = 0;
        for(int i=0;i<4;i++){
            if(arr[i]>max){
                result = i;
                max = arr[i];
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}