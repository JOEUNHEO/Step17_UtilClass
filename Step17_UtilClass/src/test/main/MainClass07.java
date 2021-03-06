package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		MemberDto dto1 = new MemberDto(1, "김구라", "노량진");
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "상도동");
		
		MemberDto[] members = new MemberDto[3];
		//고정 배열에 MemberDto 객체의 참조값 저장하기
		members[0] = dto1;
		members[1] = dto2;
		members[2] = dto3;
		
		// members 에 들어 있는 참조값을 이용해서 "해골" 을
		// 참조해서 a 라는 이름의 변수에 대입해 보세요.
		String a = members[1].getName();
		
		List<MemberDto> members2 = new ArrayList<>();
		//가변 배열에 MemberDto 객체의 참조값 저장하기
		members2.add(dto1);
		members2.add(dto2);
		members2.add(dto3);
		
		// members2 에 들어 있는 참조값을 이용해서 "해골"을
		// 참조해서 b 라는 이름의 변수에 대입해 보세요.
		String b = members2.get(1).getName();
		
	}
}
