// BOJ_28235_코드마스터 2023

import java.io.*;
import java.util.*;

public class BOJ_28235 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        String result = "";
        if (str.equals("SONGDO")) { result = "HIGHSCHOOL"; }
        else if (str.equals("CODE")) { result = "MASTER"; }
        else if (str.equals("2023")) { result = "0611"; }
        else { result = "CONTEST"; }
        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
