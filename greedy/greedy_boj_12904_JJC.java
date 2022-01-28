// greedy_boj_12904_JJC

import java.util.*;

public class greedy_boj_12904_JJC {
	static String drop(String s){
		StringBuilder str = new StringBuilder();
		str.append(s);
		str.reverse();
		return str.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean able = false;
		int startLen = t.length();
		for(int i=0; i<startLen;i++){
			if(t.charAt(t.length()-1)=='A'){
				t=t.substring(0,t.length()-1);
				if(t.equals(s)){
					able = true;
					break;
				}
			}else{
				t=t.substring(0,t.length()-1);
				t=drop(t);
				if(t.equals(s)){
					able = true;
					break;
				}
			}
		}
		if(able){
			System.out.println(1);
		} else{
			System.out.println(0);
		}
		sc.close();
	}
}
