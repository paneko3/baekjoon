// BOJ_5073_삼각형과 세 변

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5073 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        /* ==========sol========== */
        /* ==========output========== */
        while (true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int max = 0;
            max = Math.max(A,Math.max(B,C));
            if(A==0&&B==0&&C==0){
                break;
            }else if(A==B&&B==C){
                System.out.println("Equilateral");
            }else if(max>=A+B||max>=B+C||max>=A+C){
                System.out.println("Invalid");
            }else if(A==B||B==C||A==C){
                System.out.println("Isosceles");
            }else if(max<A+B&&max<B+C&&max<A+C){
                System.out.println("Scalene");
            }else {
                System.out.println("Invalid");
            }
        }
        br.close();
    }
}