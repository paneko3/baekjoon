// BOJ_17837_새로운 게임 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17837 {
    static int N, K;
    static int[][] map;
    static Piece[] pieces;
    static class Piece{
        int x,y,d;
        public Piece(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];
        Stack<Integer>[][] stacks = new Stack[N+1][N+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
                stacks[i][j]=new Stack<>();
            }
        }
        pieces = new Piece[K];
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken())-1;
            pieces[i]=new Piece(x,y,d);
            stacks[x][y].push(i);
        }
        /* ==========sol========== */
        /* ==========output========== */
        for(int a=1;a<=N;a++){
            for(int b=1;b<=N;b++){
                if(stacks[a][b].size()>=4){
                    System.out.print(0);
                    return;
                }
            }
        }
        int result=1;
        while (result<=1000){
            for(int i=0;i<K;i++){
                int x = pieces[i].x;
                int y = pieces[i].y;
                int d = pieces[i].d;
                int r = x + dx[d];
                int c = y + dy[d];
                if(r<=0||r>N||c<=0||c>N){
                    if(d==0){
                        pieces[i].d = 1;
                    }else if(d==1){
                        pieces[i].d = 0;
                    }else if(d==2){
                        pieces[i].d = 3;
                    }else {
                        pieces[i].d = 2;
                    }
                    r =  x + dx[pieces[i].d];
                    c =  y + dy[pieces[i].d];
                    if(map[r][c]==2){
                        continue;
                    }
                }
                if(map[r][c]==0){
                    Stack<Integer> temp = new Stack<>();
                    while (true){
                        int num = stacks[x][y].pop();
                        temp.push(num);
                        if(num==i){
                            break;
                        }
                    }
                    while (!temp.isEmpty()){
                        int num = temp.pop();
                        pieces[num].x=r;
                        pieces[num].y=c;
                        stacks[r][c].push(num);
                    }
                }else if(map[r][c]==1){
                    ArrayList<Integer> temp = new ArrayList<>();
                    while (true){
                        int num = stacks[x][y].pop();
                        temp.add(num);
                        if(num==i){
                            break;
                        }
                    }
                    for(int num : temp){
                        pieces[num].x=r;
                        pieces[num].y=c;
                        stacks[r][c].push(num);
                    }
                }else{
                    if(d==0){
                        pieces[i].d = 1;
                    }else if(d==1){
                        pieces[i].d = 0;
                    }else if(d==2){
                        pieces[i].d = 3;
                    }else {
                        pieces[i].d = 2;
                    }
                    r =  x + dx[pieces[i].d];
                    c =  y + dy[pieces[i].d];
                    if(r<=0||r>N||c<=0||c>N){
                        continue;
                    }
                    if(map[r][c]==0){
                        Stack<Integer> temp = new Stack<>();
                        while (true){
                            int num = stacks[x][y].pop();
                            temp.push(num);
                            if(num==i){
                                break;
                            }
                        }
                        while (!temp.isEmpty()){
                            int num = temp.pop();
                            pieces[num].x=r;
                            pieces[num].y=c;
                            stacks[r][c].push(num);
                        }
                    }else if(map[r][c]==1){
                        ArrayList<Integer> temp = new ArrayList<>();
                        while (true){
                            int num = stacks[x][y].pop();
                            temp.add(num);
                            if(num==i){
                                break;
                            }
                        }
                        for(int num : temp){
                            pieces[num].x=r;
                            pieces[num].y=c;
                            stacks[r][c].push(num);
                        }
                    }else if(map[r][c]==2){
                        continue;
                    }
                }
                for(int a=1;a<=N;a++){
                    for(int b=1;b<=N;b++){
                        if(stacks[a][b].size()>=4){
                            System.out.println(result);
                            return;
                        }
                    }
                }
            }
            result++;
        }
        System.out.println(-1);
        br.close();
    }
}
