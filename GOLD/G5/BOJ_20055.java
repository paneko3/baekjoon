// BOJ_20055_컨베이어 벨트 위의 로봇

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_20055 {
    static int N,K;
    static int[] num;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        num = new int[2*N];
        check = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<2*N;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        int result=0;
        while (true){
            result++;
            step1();
            step2();
            step3();
            if(step4()>=K){
                break;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void step1(){
        int temp = num[2*N-1];
        for(int i=2*N-1;i>0;i--){
            num[i]=num[i-1];
        }
        num[0]=temp;
        for(int i=N-1;i>0;i--) {
            check[i]=check[i-1];
        }
        check[0]=false;
        check[N - 1] = false;
    }
    static void step2(){
        for(int i=N-1;i>0;i--) {
            if(check[i-1]&&!check[i]&&num[i]>0){
                num[i]--;
                check[i]=true;
                check[i-1]=false;
            }
        }
    }
    static void step3(){
        if(num[0]>0){
            check[0]=true;
            num[0]--;
        }
    }
    static int step4(){
        int count=0;
        for(int i=0;i<2*N;i++){
            if(num[i]==0){
                count++;
            }
        }
        return count;
    }
}