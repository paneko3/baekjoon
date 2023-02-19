// BOJ_20057_마법사 상어와 토네이도

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20057 {
    static int N, count, temp, result;
    static int[][] map;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        result=0;
        int curX = N/2;
        int curY = N/2;
        int dir = 0;
        int len = 1;
        int count = 0;
        boolean flag = false;
        while (!(curX==0&&curY==0)){
            move(curX,curY,dir);
            curX+=dx[dir];
            curY+=dy[dir];
            count++;
            if(len==count){
                count=0;
                dir=dir==3?0:dir+1;
                if(flag){
                    flag=false;
                    len++;
                }else {
                    flag=true;
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void move(int curX, int curY, int dir){
        int nx = curX + dx[dir];
        int ny = curY + dy[dir];
        int total = map[nx][ny];
        count = 0;
        temp = 0;
        map[nx][ny]=0;
        sub(curX + dx[dir==3?0:dir+1],curY + dy[dir==3?0:dir+1],(int)(total*0.01));
        sub(curX + dx[dir==0?3:dir-1],curY + dy[dir==0?3:dir-1],(int)(total*0.01));
        sub(curX + dx[dir]+ dx[dir==3?0:dir+1]+ dx[dir==3?0:dir+1],curY + dy[dir]+ dy[dir==3?0:dir+1]+ dy[dir==3?0:dir+1],(int)(total*0.02));
        sub(curX + dx[dir]+ dx[dir==0?3:dir-1]+ dx[dir==0?3:dir-1],curY + dy[dir]+ dy[dir==0?3:dir-1]+ dy[dir==0?3:dir-1],(int)(total*0.02));
        sub(curX + dx[dir]+ dx[dir]+ dx[dir],curY + dy[dir]+ dy[dir]+ dy[dir],(int)(total*0.05));
        sub(curX + dx[dir]+ dx[dir==3?0:dir+1],curY + dy[dir]+ dy[dir==3?0:dir+1],(int)(total*0.07));
        sub(curX + dx[dir]+ dx[dir==0?3:dir-1],curY + dy[dir]+ dy[dir==0?3:dir-1],(int)(total*0.07));
        sub(curX + dx[dir]+ dx[dir]+ dx[dir==3?0:dir+1],curY + dy[dir]+ dy[dir]+ dy[dir==3?0:dir+1],(int)(total*0.1));
        sub(curX + dx[dir]+ dx[dir]+ dx[dir==0?3:dir-1],curY + dy[dir]+ dy[dir]+ dy[dir==0?3:dir-1],(int)(total*0.1));
        nx = curX + dx[dir] + dx[dir];
        ny = curY + dy[dir] + dy[dir];
        if(nx>=0&&nx<N&&ny>=0&&ny<N){
            map[nx][ny]+=total-count-temp;
        }else {
            result+=total-count-temp;
        }
    }
    static void sub(int nx, int ny, int amount){
        if(nx>=0&&nx<N&&ny>=0&&ny<N){
            map[nx][ny]+=amount;
            count+=amount;
        }else {
            temp+=amount;
            result+=amount;
        }
    }
}