// BOJ_10699_오늘 날짜

import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ_10699 {
    public static void main(String[] args) {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        SimpleDateFormat formater = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(formater.format(new Date()));
    }
}
