// BOJ_3226_전화 요금

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3226 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        int result = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String time = st.nextToken();
            int D = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(time.substring(0, 2));
            int min = Integer.parseInt(time.substring(3, 5));
            for(int j=0;j<D;j++){
                if(hour>=7 && hour<19){
                    result += 10;
                }else{
                    result += 5;
                }
                min++;
                if(min==60){
                    min=0;
                    hour++;
                    if(hour==24){
                        hour=0;
                    }
                }
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
