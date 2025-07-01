// BOJ_15080_Every_Second_Counts

import java.util.*;

public class BOJ_15080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========input==========
        String[] start = sc.nextLine().split(" : ");
        String[] end = sc.nextLine().split(" : ");

        int startSec = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
        int endSec = Integer.parseInt(end[0]) * 3600 + Integer.parseInt(end[1]) * 60 + Integer.parseInt(end[2]);

        // ==========sol==========
        if (endSec < startSec) {
            endSec += 24 * 3600; // 다음 날로 넘어간 경우
        }

        System.out.println(endSec - startSec);
    }
}
