// BOJ_3568_iSharp

import java.io.*;
import java.util.*;

public class BOJ_3568 {
    
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
        /* ==========input========== */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String [] data = in.split(" ");
        
        /* ==========sol========== */
		for(int i=1;i<data.length;i++)
			getParam(data[0], data[i].replaceAll(";", ""));
            
        /* ==========output========== */
		System.out.println(sb.toString());
        br.close();
	}
    
	public static void getParam(String type, String str) {
		String out="";
		StringBuilder sym=new StringBuilder();
        
		for(int i=0;i<str.length();i++) {
			char cur = str.charAt(i);
            
			if(cur=='*' || cur=='&')
				sym.append(cur);
			else if(cur=='[')
				sym.append(']');
			else if(cur==']')
				sym.append('[');
			else if(Character.isLetter(cur))
				out+=str.charAt(i);
		}
        
		sb.append(type).append(sym.reverse()).append(" ").append(out).append(";\n");
	}
}
