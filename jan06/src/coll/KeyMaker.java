package coll;

public class KeyMaker {
	private final static String pattern = "annna-aaaaa-aaana-nanan-annaa";
	private final static int[] number = {1,2,3,4,5,6,7,8,9,0};
	private final char[] alpa = {'A','B','C','D', 'E',
			'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'
			, 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
			'W', 'X', 'Y', 'Z'};

	
	public String makeKey() {
//		String key = "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < pattern.length(); i++) {
	         if (pattern.charAt(i) == 'a') {
//	        	 key += alpabet();
	        	 sb.append(alpabet());
	         }
	         else if(pattern.charAt(i) == 'n'){
//	            key += number();
	        	sb.append(alpabet());
	         }
	         else {
//	            key += "-";
	        	 sb.append("-");
	         }
	      }
//		return key;
		return sb.toString();
	}
	
	private int number() {
		return (int)(Math.random() * number.length);
	}
	
	private char alpabet() {
		return alpa[(int)(Math.random() * alpa.length)];
	}
	
	
	
	
	public static void main(String[] args) {
//시리얼키 만들기
//W269N-WFGWX-YVC9B-4J6C9-T83GX과 같은 형식으로
//n은 숫자 a는 영문자
//annna-aaaaa-aaana-nanan-annaa
//위와 같은 패턴으로 시리얼 만들어서 리스트에 저장하기
		long st = System.currentTimeMillis();
		
		KeyMaker key = new KeyMaker();
		String result = key.makeKey();
		System.out.println(result);
		
		long et = System.currentTimeMillis();
		System.out.print("걸린시간 : "+ (et - st));
		
		
		
	}
}
