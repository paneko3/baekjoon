// BOJ_28691_정보보호학부 동아리 소개

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_28691 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        /* ==========sol========== */
        /* ==========output========== */
        if(str.equals("M")){
            System.out.println("MatKor");
        }else if(str.equals("W")){
            System.out.println("WiCys");
        }else if(str.equals("C")){
            System.out.println("CyKor");
        }else if(str.equals("A")){
            System.out.println("AlKor");
        }else if(str.equals("$")){
            System.out.println("$clear");
        }
        br.close();
    }
}
