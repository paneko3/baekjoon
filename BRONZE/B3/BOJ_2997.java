// BOJ_2997_네 번째 수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2997 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        for(int i=0;i<3;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }
        /* ==========sol========== */
        Arrays.sort(num);
        int dif1 = num[1]-num[0];
        int dif2 = num[2]-num[1];
        /* ==========output========== */
        if(dif1>dif2){
            System.out.println(num[0]+dif2);
        }else if(dif1<dif2){
            System.out.println(num[1]+dif1);
        }else {
            System.out.println(num[2]+dif1);
        }
        br.close();
    }
}