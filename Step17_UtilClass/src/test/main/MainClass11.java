package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 *  [ HashSet ]
 *  
 *   - 순서가 없다
 *   - 중복을 허용하지 않는다.
 *   - 집합의 개념으로 데이터를 관리 하고 싶을 때 사용한다.
 */
public class MainClass11 {
	public static void main(String[] args) {
		//HashSet 객체 생성해서 참조값을 변수에 담기
		Set<Integer> lottoNums = new HashSet<Integer>();
		
		Random ran = new Random();
		
		while(true) {
			//1 ~ 45 사이의 랜덤한 정수를 얻어낸다.
			int num = ran.nextInt(45)+1;
			//Set 에 저장
			lottoNums.add(num); //Integer 로 자동 래핑됨!
			//Set 에 6 개가 저장되면 반복문 탈출
			if(lottoNums.size() == 6) {
				break; //반복문 블럭 빠져 나오기
			}
			
		}
		
		//반복자 객체 리턴 받기
			Iterator<Integer> it = lottoNums.iterator();
			while(it.hasNext()) {
				int tmp = it.next();
				//콘솔에 출력해 보기
				System.out.println(tmp);
			}
		
	}
}
