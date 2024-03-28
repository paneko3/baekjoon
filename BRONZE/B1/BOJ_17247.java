// BOJ_17247_택시 거리

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_17247 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        int[] info = new int[4];
        boolean flag = false;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                if(st.nextToken().equals("1")){
                    if(flag){
                        info[2]=i;
                        info[3]=j;
                    }else {
                        info[0]=i;
                        info[1]=j;
                        flag=true;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(Math.abs(info[0]-info[2])+Math.abs(info[1]-info[3]));
        br.close();
    }
}