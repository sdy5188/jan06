package coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set interface
//순서가 없어요. 중복도 없어요
public class Set01 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(5);
		set.add(7);
		set.add(2);
		set.add(10);
		
		
		System.out.println(set);
		System.out.println(set.size());
//		System.out.println(set.get());//없음
		System.out.println(set.isEmpty());
		System.out.println(set.remove(10));//인덱스 지우기
		System.out.println(set.toArray());
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer integer = (Integer)it.next();
			System.out.println(integer);
		}
		
		//로또 만들어주세요
		//1 game
		
		Set<Integer> lotto = new HashSet<Integer>();
		int n =0;
		while(n < 7) {
			lotto.add((int)(Math.random()*45)+1);
			n++;
		}
		System.out.println(lotto);
	}
}
