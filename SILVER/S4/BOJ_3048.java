// BOJ_3048_개미

import java.io.*;
import java.util.*;

public class BOJ_3048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        String group1Str = br.readLine();
        String group2Str = br.readLine();
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(group1Str);
        sb.reverse();
        sb.append(group2Str);

        char[] ants = sb.toString().toCharArray();
        boolean[] isGroup1 = new boolean[ants.length];

        for (int i = 0; i < n1; i++) isGroup1[i] = true;
        for (int i = n1; i < ants.length; i++) isGroup1[i] = false;

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < ants.length - 1; i++) {
                if (isGroup1[i] && !isGroup1[i + 1]) {
                    char tempAnt = ants[i];
                    ants[i] = ants[i + 1];
                    ants[i + 1] = tempAnt;

                    boolean tempGroup = isGroup1[i];
                    isGroup1[i] = isGroup1[i + 1];
                    isGroup1[i + 1] = tempGroup;
                    
                    i++; 
                }
            }
        }
        String result = new String(ants);

        System.out.println(result);
        br.close();
    }
}
