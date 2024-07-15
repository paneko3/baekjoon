// BOJ_22966_가장 쉬운 문제를 찾는 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_22966 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        String result = "";
        int min = 5;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(num<min){
                result=new String(str);
                min=num;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}