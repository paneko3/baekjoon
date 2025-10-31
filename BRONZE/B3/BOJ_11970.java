// BOJ_11970_Fence Painting

import java.io.*;
import java.util.*;

public class BOJ_11970 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        /* ==========sol========== */
        
        int lenFJ = b - a;
        int lenBessie = d - c;
        
        int overlapStart = Math.max(a, c);
        int overlapEnd = Math.min(b, d);
        
        int overlapLen = Math.max(0, overlapEnd - overlapStart);
        
        int totalLength = lenFJ + lenBessie - overlapLen;

        /* ==========output========== */
        System.out.println(totalLength);
        br.close();
    }
}
