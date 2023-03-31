// BOJ_10973_이전 순열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10973 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        /* ==========output========== */
        if(per(num)){
            for(int i : num){
                System.out.print(i + " ");
            }
        }else {
            System.out.println(-1);
        }
        br.close();
    }
    static boolean per(int[] num){
        int i = num.length-1;
        while (i>0&& num[i] > num[i-1]){
            i--;
        }
        if(i==0){
            return false;
        }
        int j = num.length - 1;
        while (num[i-1] < num[j]){
            j--;
        }
        swap(num, i-1, j);
        j = num.length - 1;
        while (i < j){
            swap(num, i, j);
            i++;
            j--;
        }
        return true;
    }
    static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
