// BOJ_17779_게리맨더링 2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_17779 {
    static int N;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                map[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        /* ==========sol========== */
        int result = Integer.MAX_VALUE;
        for(int x=1;x<=N;x++){
            for(int y=1;y<=N;y++){
                for(int d1=0;d1<=N;d1++){
                    for(int d2=0;d2<=N;d2++){
                        if(x+d1+d2>N){
                            continue;
                        }
                        if(y-d1<1||y+d2>N){
                            continue;
                        }
                        result=Math.min(result,cal(x,y,d1,d2));
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static int cal(int x, int y, int d1, int d2){
        int[][] border = new int[N+1][N+1];
        for(int i=0;i<=d1;i++){
            border[x+i][y-i]=5;
            border[x+i+d2][y-i+d2]=5;
        }
        for(int i=0;i<=d2;i++){
            border[x+i][y+i]=5;
            border[x+i+d1][y+i-d1]=5;
        }
        boolean flag = false;
        for(int i=x+1;i<x+d1+d2;i++){
            for(int j=1;j<=N;j++){
                if(flag){
                    if(border[i][j]==5){
                        flag=false;
                        break;
                    }
                    border[i][j]=5;
                }
                if(border[i][j]==5){
                    flag=true;
                }
            }
        }
        for(int i=1;i<x+d1;i++){
            for(int j=1;j<=y;j++){
                if(border[i][j]==5) {
                    continue;
                }
                border[i][j]=1;
            }
        }
        for(int i=1;i<=x+d2;i++){
            for(int j=y+1;j<=N;j++){
                if(border[i][j]==5) {
                    continue;
                }
                border[i][j]=2;
            }
        }
        for(int i=x+d1;i<=N;i++){
            for(int j=1;j<y-d1+d2;j++){
                if(border[i][j]==5) {
                    continue;
                }
                border[i][j]=3;
            }
        }

        for(int i=x+d2+1;i<=N;i++){
            for(int j=y-d1+d2;j<=N;j++){
                if(border[i][j]==5) {
                    continue;
                }
                border[i][j]=4;
            }
        }
        int[] array = new int[5];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                array[border[i][j]-1]+=map[i][j];
            }
        }
        Arrays.sort(array);
        return array[4]-array[0];
    }
}
