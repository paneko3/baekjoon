// BOJ_20232_Archivist

import java.io.*;
import java.util.*;

public class BOJ_20232 {
    public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        /* ==========sol========== */
        Map<Integer, String> winners = new HashMap<>();
        winners.put(1995, "ITMO");
        winners.put(1996, "SPbSU");
        winners.put(1997, "SPbSU");
        winners.put(1998, "ITMO");
        winners.put(1999, "ITMO");
        winners.put(2000, "SPbSU");
        winners.put(2001, "ITMO");
        winners.put(2002, "ITMO");
        winners.put(2003, "ITMO");
        winners.put(2004, "ITMO");
        winners.put(2005, "ITMO");
        winners.put(2006, "PetrSU, ITMO");
        winners.put(2007, "SPbSU");
        winners.put(2008, "SPbSU");
        winners.put(2009, "ITMO");
        winners.put(2010, "ITMO");
        winners.put(2011, "ITMO");
        winners.put(2012, "ITMO");
        winners.put(2013, "SPbSU");
        winners.put(2014, "ITMO");
        winners.put(2015, "ITMO");
        winners.put(2016, "ITMO");
        winners.put(2017, "ITMO");
        winners.put(2018, "SPbSU");
        winners.put(2019, "ITMO");

        String winner = winners.get(y);
        /* ==========output========== */
        System.out.println(winner);
        br.close();
    }
}
