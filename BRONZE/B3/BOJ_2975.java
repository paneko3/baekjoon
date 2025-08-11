// BOJ_2975_Transactions

import java.io.*;
import java.util.*;

public class BOJ_2975 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int balance = Integer.parseInt(st.nextToken());
            char type = st.nextToken().charAt(0);
            int amount = Integer.parseInt(st.nextToken());
            if (balance == 0 && type == 'W' && amount == 0) break;
            /* ==========sol========== */
            int newBalance;
            if (type == 'D') {
                newBalance = balance + amount;
                result.append(newBalance).append("\n");
            } else { // type == 'W'
                newBalance = balance - amount;
                if (newBalance < -200) {
                    result.append("Not allowed\n");
                } else {
                    result.append(newBalance).append("\n");
                }
            }
        }
        /* ==========output========== */
        System.out.print(result);
        br.close();
    }
}
