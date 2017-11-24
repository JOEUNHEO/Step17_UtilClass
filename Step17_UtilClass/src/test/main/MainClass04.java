package test.main;

import java.util.ArrayList;
import test.dto.MemberDto;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	3 명의 회원정보를 각각 MemberDto 객체에 담고
		 * 	ArrayList 객체에 MemberDto 객체의 참조값을
		 * 	누적 시켜 보세요.
		 */
		
		MemberDto member1 = new MemberDto(1, "김구라", "행신동");
		MemberDto member2 = new MemberDto(2, "원숭이", "봉천동");
		MemberDto member3 = new MemberDto(3, "해골", "신림동");
		
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		for(MemberDto tmp:members) {
			System.out.println("번호 : "+tmp.getNum()+", 이름 : "+tmp.getName()+", 주소 : "+tmp.getAddr());
		}
		
	}
	
}
