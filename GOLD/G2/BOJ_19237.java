// BOJ_19237_어른 상어

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_19237 {
    static int N,M,k;
    static int[] dx = {0,-1,1,0,0};
    static int[] dy = {0,0,0,-1,1};
    static int[][][] orders;
    static Shark[] sharks;
    static Node[][] map;
    static class Shark{
        int r,c,d;
        public Shark(int r, int c,int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
    static class Node{
        int idx,time;
        public Node(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        orders = new int[M+1][4+1][4+1];
        sharks = new Shark[M+1];
        map = new Node[N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                int temp = Integer.parseInt(st.nextToken());
                if(temp!=0){
                    map[i][j]=new Node(temp,k);
                    sharks[temp]=new Shark(i,j,0);
                }else {
                    map[i][j]=new Node(0,0);
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=M;i++){
            sharks[i].d = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=M;i++){
            for(int j=1;j<=4;j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=1;k<=4;k++){
                    orders[i][j][k] = Integer.parseInt(st.nextToken());;
                }
            }
        }
        /* ==========sol========== */
        int result = 0;
        int count = 0;
        while (count<M-1){
            boolean[][] check = new boolean[N+1][N+1];
            for(int i=1;i<=M;i++){
                if(sharks[i].d==0){
                    continue;
                }
                int r = sharks[i].r;
                int c = sharks[i].c;
                int d = sharks[i].d;

                boolean flag=false;
                for(int j=1;j<=4;j++){
                    int dir = orders[i][d][j];
                    int nr = r + dx[dir];
                    int nc = c + dy[dir];
                    if(nr<=0||nr>N||nc<=0||nc>N){
                        continue;
                    }
                    int idx = map[nr][nc].idx;
                    if(idx==0){
                        map[r][c].idx=i;
                        map[r][c].time=k;
                        sharks[i].r = nr;
                        sharks[i].c = nc;
                        sharks[i].d = dir;
                        map[nr][nc].idx=i;
                        map[nr][nc].time=k;
                        flag=true;
                        check[nr][nc]=true;
                        break;
                    }else if(map[nr][nc].time==k && check[nr][nc]){
                        count++;
                        sharks[i].r=0;
                        sharks[i].c=0;
                        sharks[i].d=0;
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    for(int j=1;j<=4;j++){
                        int dir = orders[i][d][j];
                        int nr = r + dx[dir];
                        int nc = c + dy[dir];
                        if(nr<=0||nr>N||nc<=0||nc>N){
                            continue;
                        }
                        int num = map[nr][nc].idx;
                        if(num==i){
                            map[r][c].idx=i;
                            map[r][c].time=k;
                            sharks[i].r = nr;
                            sharks[i].c = nc;
                            sharks[i].d = dir;
                            break;
                        }
                    }
                }
            }
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(map[i][j].time>0){
                        if(map[i][j].time==1){
                            map[i][j].idx=0;
                        }
                        map[i][j].time--;
                    }
                }
            }
            for(int i=1;i<=M;i++){
                int r = sharks[i].r;
                int c = sharks[i].c;
                int d = sharks[i].d;
                if(d!=0){
                    map[r][c].time=k;
                    map[r][c].idx=i;
                }
            }
            result++;
            if(result>1000){
                System.out.println(-1);
                return;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
