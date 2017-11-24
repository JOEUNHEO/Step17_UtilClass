package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
	public static void main(String[] args) {
		//String type 을 담을 수 있는 ArrayList 객체 생성
		List<String> msgs = new ArrayList<String>();//가변 배열 객체
		// .add() 데이터 추가
		msgs.add("하나");
		msgs.add("두울");
		msgs.add("세엣");
		// int type 을 담을 수 있는 ArrayList 객체 생성
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// .get(index) 데이터 참조
		String a = msgs.get(0);
		String b = msgs.get(1);
		String c = msgs.get(2);
	}
}
