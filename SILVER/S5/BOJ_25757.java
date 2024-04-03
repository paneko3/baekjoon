// BOJ_25757_임스와 함께하는 미니게임

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_25757 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char c = st.nextToken().charAt(0);
        int num = 2;
        if(c=='F'){
            num=3;
        }else if(c=='O'){
            num=4;
        }
        int result = 0;
        int count = 1;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<N;i++ ){
            String name = br.readLine();
            if(set.contains(name)){
                continue;
            }
            set.add(name);
            count++;
            if(count==num){
                result++;
                count=1;
            }
        }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}