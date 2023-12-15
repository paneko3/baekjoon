// BOJ_6679_싱기한 네자리 숫자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6679 {
    public static void main(String[] args) {
        /* ==========input========== */
        /* ==========sol========== */
        /* ==========output========== */
        for(int i=1000; i<=9999; i++)
        {
            int num = i;
            int[] result = new int[3];
            while (num >= 10) {
                result[0] += num % 10;
                num /= 10;
            }
            result[0] += num % 10;
            num = i;
            while (num >= 12) {
                result[1] += num % 12;
                num /= 12;
            }
            result[1] += num % 12;
            num = i;
            while (num >= 16) {
                result[2] += num % 16;
                num /= 16;
            }
            result[2] += num % 16;
            if(result[0]==result[1]&&result[0]==result[2]){
                System.out.println(i);
            }
        }
    }
}