// BOJ_3023_마술사 이민혁

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3023 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        char[][] map = new char[R*2][C*2];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
            }
            for(int j=C;j<2*C;j++){
                map[i][j]=str.charAt(2*C-j-1);
            }
        }
        for(int i=R;i<2*R;i++){
            for(int j=0;j<2*C;j++){
                map[i][j]=map[2*R-i-1][j];
            }
        }
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        map[A-1][B-1]=map[A-1][B-1]=='#'?'.':'#';
        /* ==========output========== */
        for(int i=0;i<2*R;i++){
            for (int j=0;j<2*C;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        br.close();
    }
}