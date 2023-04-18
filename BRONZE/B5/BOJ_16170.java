// BOJ_16170_오늘의 날짜는?

import java.text.SimpleDateFormat;
import java.util.Date;

public class BOJ_16170 {
    public static void main(String[] args) {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy\nMM\ndd");
        System.out.println(date.format(today));
    }
}