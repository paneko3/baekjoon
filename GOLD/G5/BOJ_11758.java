// BOJ_11758_CCW

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11758 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] point = new int[3][2];
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            point[i][0]=Integer.parseInt(st.nextToken());
            point[i][1]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int a = point[1][0]-point[0][0];
        int b = point[1][1]-point[0][1];
        int c = point[2][0]-point[0][0];
        int d = point[2][1]-point[0][1];
        int result = a*d-b*c;
        /* ==========output========== */
        System.out.println(result==0?0:result>0?1:-1);

        br.close();
    }
}
