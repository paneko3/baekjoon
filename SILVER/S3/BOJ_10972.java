// BOJ_10972_다음 순열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10972 {
    static int N;
    static int[] array;
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        dfs();
        br.close();
    }
    static void dfs(){
        boolean flag = true;
        Loop:for(int i = N-1;i>0;i--){
            if(array[i-1]<array[i]){
                for(int j = N-1;j>=i;j--){
                    if(array[j]>array[i-1]){
                        int temp = array[j];
                        array[j]=array[i-1];
                        array[i-1]=temp;
                        int k = N-1;
                        while (i<k){
                            int temp2 = array[i];
                            array[i]= array[k];
                            array[k]=temp2;
                            i++;
                            k--;
                        }
                        flag = false;
                        break Loop;
                    }
                }
            }
        }
        if (flag) {
            System.out.println(-1);
        }else {
            for(int i=0;i<N;i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}
