// BOJ_2953_나는 요리사다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int result1=0;
        int result2=0;
        for(int i=0;i<5;i++){
            st=  new StringTokenizer(br.readLine());
            int temp =0;
            for(int j=0;j<4;j++){
                temp+=Integer.parseInt(st.nextToken());
            }
            if(temp>result2){
                result2=temp;
                result1=i+1;
            }
        }
        /* ==========output========== */
        System.out.println(result1 + " " +result2);
        br.close();
    }
}
