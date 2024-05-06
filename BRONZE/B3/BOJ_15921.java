// BOJ_15921_수찬은 마린보이야!!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15921 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        if(N==0){
            System.out.println("divide by zero");
            return;
        }
        st = new StringTokenizer(br.readLine());
        double sum1 = 0;
        double sum2 = 0;
        for(int i=0;i<N;i++){
            double num = Double.parseDouble(st.nextToken());
            sum1+=num;
            sum2+= num*(1/(double)N);
        }
        /* ==========output========== */
        System.out.printf("%.2f",(sum1/N)/sum2);
        br.close();
    }
}