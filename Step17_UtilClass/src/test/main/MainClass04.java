package test.main;

import java.util.ArrayList;
import test.dto.MemberDto;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	3 ���� ȸ�������� ���� MemberDto ��ü�� ���
		 * 	ArrayList ��ü�� MemberDto ��ü�� ��������
		 * 	���� ���� ������.
		 */
		
		MemberDto member1 = new MemberDto(1, "�豸��", "��ŵ�");
		MemberDto member2 = new MemberDto(2, "������", "��õ��");
		MemberDto member3 = new MemberDto(3, "�ذ�", "�Ÿ���");
		
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		members.add(member1);
		members.add(member2);
		members.add(member3);
		
		for(MemberDto tmp:members) {
			System.out.println("��ȣ : "+tmp.getNum()+", �̸� : "+tmp.getName()+", �ּ� : "+tmp.getAddr());
		}
		
	}
	
}
