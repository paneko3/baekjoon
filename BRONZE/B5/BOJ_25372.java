// BOJ_25372_성택이의 은밀한 비밀번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_25372 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=0;i<N;i++){
            String str = br.readLine();
            if(str.length()>=6&&str.length()<=9){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        br.close();
    }
}
