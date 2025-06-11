// BOJ_6763_Speed_fines_are_not_fine!

import java.io.*;

public class BOJ_6763 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        /* ==========sol========== */
        int over = speed - limit;
        String result;
        if (over <= 0) {
            result = "Congratulations, you are within the speed limit!";
        } else if (over <= 20) {
            result = "You are speeding and your fine is $100.";
        } else if (over <= 30) {
            result = "You are speeding and your fine is $270.";
        } else {
            result = "You are speeding and your fine is $500.";
        }

        /* ==========output========== */
        System.out.println(result);
    }
}
