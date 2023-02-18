// BOJ_1264_모음의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            /* ==========input========== */
            String str = br.readLine().toLowerCase();
            /* ==========sol========== */
            if(str.equals("#")){
                break;
            }
            int count = 0;
            for(int i = 0; i<str.length();i++){
                char c = str.charAt(i);
                if(c == 'a'|| c=='e' || c=='i'|| c=='o' || c=='u'){
                    count++;
                }
            }
            /* ==========output========== */
            System.out.println(count);
        }
        br.close();
    }
}
