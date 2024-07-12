// BOJ_17350_2루수 이름이 뭐야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17350 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            if(br.readLine().equals("anj")){
                System.out.println("뭐야;");
                return;
            }
        }
        System.out.println("뭐야?");
        br.close();
    }
}