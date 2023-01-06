package coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List : 순서가 있어요. 중복 허용합니다.
//Set : 순서가 없어요. 중복 허용 안해요.
//Map : 순서가 없어요. 중복 허용 안해요.
//		<Key, Value>형태로 저장해요
//
//내일 할 것
//시리얼키 만들기
//W269N-WFGWX-YVC9B-4J6C9-T83GX과 같은 형식으로
//n은 숫자 a는 영문자
//annna-aaaaa-aaana-nanan-annaa
//위와 같은 패턴으로 시리얼 만들어서 리스트에 저장하기

//40 개 중복없이 저장하는 건...  이건 set배우고 하죠;;;;;;;

public class List01 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		//add(E) : 뒤에 붙어요
		//add(index, E) : 해당 index에 끼어들어가요
		list.add(0, 150);
		System.out.println(list.size());//길이
		
		//remove(index);
		//clear();
		
		//set(index, E); //교체
		
		int count = list.indexOf(150);//0이므로 E가 있는 index
		System.out.println(count);
		//해당 값이 있는지?
		System.out.println(list.contains(150));
		System.out.println(list.contains(50));
		
		//0번째에 있는 값을 줍니다.
		Integer value =  list.get(0);
		System.out.println(value);
		
		//비어있어?
		System.out.println(list.isEmpty());
		
		//[150, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==========================================");
		
		//iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//객체.hasNext()
//해당 이터레이션(iteration)이 다음 요소를 가지고 있으면
//true를 반환하고, 다음 요소를 가지고 있지 않으면 false

//객체.next()	다음 요소를 반환함
		
		
		List<String> key = new ArrayList<String>();
		key.add("123-456-789");
		key.add("111-222-333");
		key.add("444-555-666");
		
		System.out.println(key);
		
	}
}
