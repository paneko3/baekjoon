// BOJ_6996_애너그램

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BOJ_6996 {
    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        int[] countA = new int[26];
        int[] countB = new int[26];
        for(int j=0;j<first.length();j++){
            countA[first.charAt(j)-'a']++;
        }
        for(int j=0;j<second.length();j++){
            countB[second.charAt(j)-'a']++;
        }
        for(int j=0;j<26;j++){
            if(countA[j]!=countB[j]){
                return false;
            }
        }
        return true;

        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}