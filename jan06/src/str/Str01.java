package str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트링 문자열 String
public class Str01 {
	public static void main(String[] args) {
		
		String str = "100";
		String str2 = new String("100");
		
		char ch = 'A';
		str = str + ch + 150;//연결
		
		System.out.println(str);//100A150
		
		int num = 100 + 150;//계산
		
		str2 = "A"+ 127;
		//문자 + 숫자 = 문자
		//문자 + 문자 = 문자
		//숫자 + 문자 = 문자
		//숫자 + 숫자 = 숫자
		System.out.println(str2);
		
		str2 = 1 + 2 + 3 + "A";
		System.out.println(str2);
		
		str2 = "2" + 1 + 2 + 3 + "A";
		System.out.println(str2);//26A가 아니라 2123A
		
		str2 = 2 + 1 + "2" + 3 + "A";
		System.out.println(str2);//3 2 3A
		
		str2 = "2" + (1 + 2 + 3) + "A";
		System.out.println(str2);//26A
		
		str2 = "안녕하세요";
		
		char[] hi = str2.toCharArray();
		System.out.println(Arrays.toString(hi));
		//[안, 녕, 하, 세, 요]
		
		System.out.println(str2.charAt(0));
		System.out.println(str2.indexOf("안"));//0 인덱스위치
		System.out.println(str2.indexOf("가"));//-1 없음
		
		List<String> hiList = Arrays.asList(str2);
		System.out.println(hiList);//[안녕하세요]
		
		String str3 = new String(hi, 1, 2);
		System.out.println(str3);//녕하
		
		
		str3 = "asdfsadfasfdasfafdasdfasdfasdfsfdsadfasdf";
		System.out.println("d가 몇개?");
		int count = 0;
		for (int i = 0; i < str3.length(); i++) {
			if(str3.charAt(i) == 'd') {
				count++;
			}
		}
		System.out.println("총 " + count + "개");
		
		str3 = "Hi5";
		System.out.println(Character.isAlphabetic('A'));//알파벳인가?
		System.out.println(Character.isDigit('5'));//숫자인가?
		System.out.println(Character.isUpperCase('A'));//대문자인가?
		System.out.println(Character.isLowerCase('A'));//소문자인가?
		
		System.out.println(Character.isAlphabetic(str3.charAt(0)));
		System.out.println(Character.isLowerCase(str3.charAt(1)));
		System.out.println(Character.isDigit(str3.charAt(2)));
		
		System.out.println(str3.contains("cat"));//str3안에 cat이있냐
		System.out.println(str3.contains("Hi"));//포함하고 있는지
		
		str3 = str3.concat(" 입니다.");
		System.out.println(str3);//Hi5입니다.
		
		System.out.println(str3.endsWith("니다"));
		
		String email = "ehddud7944@naver.com";
		System.out.println(email.endsWith(".com"));
		
		System.out.println("=========================");
		
//		String str1 = "Hi";
//		str2 = "Hi";
//		
//		System.out.println(str1 == str2);//같다
		
		String str1 = new  String("Hi");
		str2 = new String("Hi");
		
		System.out.println(str1 == str2);//다르다
		//불변성, immortal
		System.out.println(str1.endsWith(str2));//비교의 정석
		
		str1 = "안녕하세요";
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append("날씨가 참 좋네요");
		sb.append("호호");
		System.out.println(sb.toString());
		
		System.out.println(email.indexOf("@"));
		//내 email
		email = "myemail@naver.co.kr";
		String str4 = email.substring(0, email.indexOf("@"));
		System.out.println(str4);
		String server = email.substring(email.indexOf("@")+1, email.indexOf("."));//naver
		System.out.println(server);

		
	}
}
