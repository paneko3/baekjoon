// BOJ_2870_수학숙제

import java.io.*;
import java.util.*;

public class BOJ_2870 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> numbers = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            
            String[] tokens = line.split("[a-z]");
            
            for (String num : tokens) {
                if (num.isEmpty()) {
                    continue;
                }
                
                num = num.replaceFirst("^0+", "");
                
                if (num.isEmpty()) {
                    numbers.add("0");
                } else {
                    numbers.add(num);
                }
            }
        }
        
        /* ==========sol========== */
        
        Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });
        
        /* ==========output========== */
        StringBuilder sb = new StringBuilder();
        for (String num : numbers) {
            sb.append(num).append('\n');
        }
        
        System.out.print(sb.toString());
        br.close();
    }
}
