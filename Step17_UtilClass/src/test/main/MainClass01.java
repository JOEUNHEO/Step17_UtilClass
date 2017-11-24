package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 담을 수 있는 ArrayList 객체 생성
		ArrayList<String> msgs = new ArrayList<String>();//가변 배열 객체
		msgs.add("하나");
		msgs.add("두울");
		msgs.add("세엣");
		// int type 을 담을 수 있는 ArrayList 객체 생성
		// 기본 데이터 type(클래스가 아님) 을 담을 수 없으므로 객체형 type 으로 담아야 한다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
	}
}
