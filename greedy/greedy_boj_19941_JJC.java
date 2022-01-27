// greedy_boj_19941_JJC

import java.util.*;

public class greedy_boj_19941_JJC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String str = sc.next();
		char[] arr = new char[n];
		for(int i=0; i<n;i++){
			arr[i]=str.charAt(i);
		}
		int result=0;
		boolean pick;
		for(int i=0;i<n;i++){
			if(arr[i]=='P'){
				pick=false;
				for(int j=k; j>=0;j--){
					if(i-j>=0){
						if(arr[i-j]=='H'){
							arr[i-j]='B';
							result++;
							pick=true;
							break;
						}
					}
				}
				if(pick==false){
					for(int j=1; j<=k;j++){
						if(i+j<n){
							if(arr[i+j]=='H'){
								arr[i+j]='B';
								result++;
								pick=true;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(result);


		sc.close();
	}
}
