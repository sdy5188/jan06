package what;

import java.util.*;
public class What {
	
	public static void main(String[] args) {
		String ex1 = "aaabbcccccca";//12자
		int count = 0;
//		char[] ex = ex1.toCharArray();
//		System.out.println(Arrays.toString(ex1));
		for (int i = 0; i < ex1.length(); i++) {
			for (int j = i+1; j < ex1.length(); j++) {
				if(ex1.charAt(i) == ex1.charAt(j)) {
					count++;
					break;
				}
				else {
					
				}
				
			}
		}
		System.out.println(count);
	}
}
