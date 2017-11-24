package test.main;

import java.util.ArrayList;

import test.dto.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		//MemberDto type 의 참조값을 담을 수 있는
		//방 3개짜리 고정 배열
		MemberDto[] members = new MemberDto[3];
		
		//MemberDto type 의 참조값을 담을 수 있는 가변 배열
		ArrayList<MemberDto> members2 = new ArrayList<MemberDto>();
		
		//아래의 배열 배교 하기
		//고정 배열은 기본 데이터 type 와 wrapper class 를 담을 수 있다.
		int[] nums = new int[3];
		
		Integer[] nums3 = new Integer[3];
		
		//가변 배열은 기본 데이터 type 을 담을 수 없으므로, wrapper class 로 담아야 한다.
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(10);
	}
}
