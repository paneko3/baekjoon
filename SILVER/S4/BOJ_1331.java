// BOJ_1331_나이트 투어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1331 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] visit = new boolean[6][6];
        String s = br.readLine();
        /* ==========sol========== */
        int firstX = s.charAt(0)-'A';
        int firxtY = s.charAt(1)-'1';
        int x = firstX;
        int y = firxtY;
        visit[x][y]=true;
        for(int i=0;i<35;i++){
            s = br.readLine();
            int r = s.charAt(0)-'A';
            int c = s.charAt(1)-'1';
            if(r<0||r>=6||c<0||c>=6||visit[r][c]){
                System.out.println("Invalid");
                return;
            }
            if((Math.abs(x-r)+Math.abs(y-c))!=3||Math.abs(x-r)==3||Math.abs(y-c)==3){
                System.out.println("Invalid");
                return;
            }
            x=r;
            y=c;
            visit[x][y]=true;
        }
        if((Math.abs(x-firstX)+Math.abs(y-firxtY))!=3||Math.abs(x-firstX)==3||Math.abs(y-firxtY)==3){
            System.out.println("Invalid");
            return;
        }
        /* ==========output========== */
        System.out.println("Valid");
        br.close();
    }
}