// BOJ_8911_거북이

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8911 {
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            /* ==========input========== */
            String control = br.readLine();
            /* ==========sol========== */
            int dir = 0;
            int x = 0;
            int y = 0;
            int maxX = 0;
            int minX = 0;
            int maxY = 0;
            int minY = 0;
            for(int i=0;i<control.length();i++){
                char c =  control.charAt(i);
                if(c=='F'){
                    x+=dx[dir];
                    y+=dy[dir];
                }else if(c=='B'){
                    x-=dx[dir];
                    y-=dy[dir];
                }else if(c=='L'){
                    dir=(dir==3?0:dir+1);
                    continue;
                }else{
                    dir=(dir==0?3:dir-1);
                    continue;
                }
                maxX = Math.max(maxX,x);
                maxY = Math.max(maxY,y);
                minX = Math.min(minX,x);
                minY = Math.min(minY,y);
            }
            /* ==========output========== */
            System.out.println((maxX-minX)*(maxY-minY));
        }
        br.close();
    }

}