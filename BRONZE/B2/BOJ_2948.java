// BOJ_2948_2009년

import java.io.*;
import java.time.*;

public class BOJ_2948 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        /* ==========sol========== */
        LocalDate date = LocalDate.of(2009, M, D);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String result = capitalize(dayOfWeek.toString());

        /* ==========output========== */
        System.out.println(result);
    }

    private static String capitalize(String s) {
        return s.charAt(0) + s.substring(1).toLowerCase(); // MONDAY -> Monday
    }
}
