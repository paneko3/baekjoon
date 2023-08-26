// BOJ_23795_사장님 도박은 재미로 하셔야 합니다
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result =0;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==-1){
                break;
            }
            result += n;
        }
        System.out.println(result);
        br.close();
    }
