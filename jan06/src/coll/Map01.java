package coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map<K, V> : Key는 중복 x, Value는 중복가능
public class Map01 {
	public static void main(String[] args) {
		
		//E, T, K, N
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//저장 put(K, V)
		map.put("홍길동", 12);
		map.put("김길동", 30);
		map.put("이길동", 12);
		map.put("박길동", 12);
		map.put("최길동", 12);
		map.put("홍길동", 100);
		
		System.out.println(map);//중복제거는 덮어씌움
		
		Map<String, String> map2 =  new HashMap<String, String>();
		map2.put("www", "www");//사전형태(값=정보느낌)
		
		//출력 get(K)
		
		System.out.println(map.get("이길동"));
		System.out.println(map.get("없는거"));//null
		
		//있는지 물어보기
		System.out.println(map.containsKey("이길동"));//true
		System.out.println(map.containsKey("이길동1"));//false
		
		System.out.println(map.containsValue(100));//true
		System.out.println(map.containsValue(1000));//false
		
		//지우기 remove(K)
		System.out.println(map.remove("이길동"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		//1. map -> set -> list
		//2. map -> set === iterator
//		Set<String> map2set = new HashSet<String>();
		Set<String> map2set = map.keySet();//키만 뽑아서 사용
		System.out.println(map2set);
		//[박길동, 김길동, 홍길동, 최길동]
		List<String> set2List = new ArrayList<String>(map2set);
		System.out.println(set2List);
//		[박길동, 김길동, 홍길동, 최길동]
		for (int i = 0; i < set2List.size(); i++) {
			System.out.println("K : "+ set2List.get(i));
			Integer value = map.get(set2List.get(i));
			System.out.println("V : " + value);
		}
		
		System.out.println("=============================");
		System.out.println(map2);
		Set<String> q = map2.keySet();
		List<String> QsetList = new ArrayList<String>(q);
		for (int i = 0; i < QsetList.size(); i++) {
			System.out.println(QsetList.get(i));
			String value = map2.get(QsetList.get(i));
			System.out.println(value);
		}
		System.out.println("=============================");
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print("K : "+ key);
			System.out.println(", V : " + map.get(key));
		}
		
		
		
		
		
	}
}
