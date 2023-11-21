// BOJ_2303_숫자 게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2303 {
    static int N, result, max;
    static int[] arr, choice;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        result = 0;
        max = 0;
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            arr = new int[5];
            choice = new int[3];
            for(int j=0;j<5;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            /* ==========sol========== */
            com(0,0,i);
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
    static void com(int count, int start,int idx){
        if(count==3){
            int num = (choice[0]+choice[1]+choice[2])%10;
            if(num>=max){
                max=num;
                result=idx;
            }
            return;
        }
        for(int i=start;i<5;i++){
            choice[count]=arr[i];
            com(count+1,i+1,idx);
        }
    }
}