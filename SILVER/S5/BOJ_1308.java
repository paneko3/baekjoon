// BOJ_1308_D-Day

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class BOJ_1308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========input==========
        int y1 = sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt();
        int y2 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();

        LocalDate start = LocalDate.of(y1, m1, d1);
        LocalDate end = LocalDate.of(y2, m2, d2);

        // ==========sol==========
        if (end.isAfter(start.plusYears(1000)) || end.equals(start.plusYears(1000))) {
            System.out.println("gg");
        } else {
            long days = ChronoUnit.DAYS.between(start, end);
            System.out.println("D-" + days);
        }
    }
}
