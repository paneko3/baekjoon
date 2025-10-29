// BOJ_28295_체육은 코딩과목 입니다

import java.io.*;
import java.util.*;

public class BOJ_28295
 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /* ==========sol========== */
        
        int currentDirection = 0;
        
        for (int i = 0; i < 10; i++) {
            int command = Integer.parseInt(br.readLine());
            
            if (command == 1) { 
                currentDirection = (currentDirection + 1) % 4;
            } else if (command == 2) { 
                currentDirection = (currentDirection + 2) % 4;
            } else if (command == 3) { 
                currentDirection = (currentDirection + 3) % 4;
            }
        }
        
        String result = "";
        if (currentDirection == 0) {
            result = "N";
        } else if (currentDirection == 1) {
            result = "E";
        } else if (currentDirection == 2) {
            result = "S";
        } else if (currentDirection == 3) {
            result = "W";
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
