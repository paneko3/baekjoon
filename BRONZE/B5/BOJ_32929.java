// BOJ_32929_UOS 문자열

import java.io.*;

public class BOJ_32929 {
	public static void main(String[] args) throws IOException {
		// ==========input==========
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());  // x가 최대 10^9이므로 long 사용

        // ==========sol==========
        int mod = (int)(x % 3);
        char result;

        if (mod == 1) {
            result = 'U';
        } else if (mod == 2) {
            result = 'O';
        } else {
            result = 'S';
        }

        // ==========output==========
        System.out.println(result);
		br.close();
	}
}