// BOJ_2712_미국 스타일

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int i=0;i<T;i++){
            /* ==========input========== */
            st = new StringTokenizer(br.readLine());
            double d = Double.parseDouble(st.nextToken());
            String str = st.nextToken();
            /* ==========sol========== */
            /* ==========output========== */
            if(str.equals("kg")){
                System.out.printf("%.4f lb",d*2.2046);
            }else if(str.equals("lb")){
                System.out.printf("%.4f kg",d* 0.4536);
            }else if(str.equals("l")){
                System.out.printf("%.4f g",d*0.2642);
            }else if(str.equals("g")){
                System.out.printf("%.4f l",d*3.7854);
            }
            System.out.println();
        }
        br.close();
    }
}