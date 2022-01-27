// greedy_boj_15904_JJC

import java.util.*;

public class greedy_boj_15904_JJC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();

		int count=0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)=='U' && count ==0){
				count=1;
			}
			if(str.charAt(i)=='C' && count ==1){
				count=2;
			}
			if(str.charAt(i)=='P' && count ==2){
				count=3;
			}
			if(str.charAt(i)=='C' && count ==3){
				count=4;
			}
		}
		if(count==4){
			System.out.println("I love UCPC");
		} else{
			System.out.println("I hate UCPC");
		}

		sc.close();
	}
}
