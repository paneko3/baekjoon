// BOJ_3613_Java vs C++

import java.io.*;
import java.util.*;

public class BOJ_3613 {

    private static String toCpp(String javaStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < javaStr.length(); i++) {
            char c = javaStr.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append('_');
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static String toJava(String cppStr) {
        StringBuilder sb = new StringBuilder();
        boolean nextUpper = false;

        for (int i = 0; i < cppStr.length(); i++) {
            char c = cppStr.charAt(i);
            if (c == '_') {
                nextUpper = true;
            } else {
                if (nextUpper) {
                    sb.append(Character.toUpperCase(c));
                    nextUpper = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        /* ==========sol========== */
        
        boolean hasUnderscore = input.contains("_");
        
        boolean isCppFormat = false;
        if (hasUnderscore) {
            boolean onlyLowerCase = true;
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c) || Character.isDigit(c)) {
                    onlyLowerCase = false;
                    break;
                }
            }
            if (onlyLowerCase && input.charAt(0) != '_' && input.charAt(input.length() - 1) != '_' && !input.contains("__")) {
                isCppFormat = true;
            }
        }

        boolean isJavaFormat = false;
        if (!hasUnderscore) {
            if (input.length() > 0 && Character.isLowerCase(input.charAt(0))) {
                isJavaFormat = true;
            }
        }
        
        String result;
        
        if (isJavaFormat && isCppFormat) {
            result = input;
        } else if (isJavaFormat) {
            result = toCpp(input);
        } else if (isCppFormat) {
            result = toJava(input);
        } else {
            result = "Error!";
        }

        /* ==========output========== */
        System.out.println(result);
        br.close();
    }
}
