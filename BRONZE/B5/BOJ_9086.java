// BOJ_9086_문자열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		/* ==========input========== */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String str = br.readLine();
                System.out.print((char)(str.charAt(0)));
                System.out.println((char)(str.charAt(str.length()-1)));
        }
		/* ==========sol========== */
		/* ==========output========== */
		br.close();
	}

}
