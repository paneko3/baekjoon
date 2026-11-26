// BOJ_21354_Äpplen och päron

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_21354 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        /* ==========sol========== */
        int axel = A*7;
        int petra = P*13;

        String result = "";
        if(axel>petra){
            result = "Axel";
        }else if(axel<petra){
            result = "Petra";
        }else{
            result = "lika";
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
