package test.main;

import java.util.ArrayList;

import test.dto.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		//MemberDto type �� �������� ���� �� �ִ�
		//�� 3��¥�� ���� �迭
		MemberDto[] members = new MemberDto[3];
		
		//MemberDto type �� �������� ���� �� �ִ� ���� �迭
		ArrayList<MemberDto> members2 = new ArrayList<MemberDto>();
		
		//�Ʒ��� �迭 �豳 �ϱ�
		//���� �迭�� �⺻ ������ type �� wrapper class �� ���� �� �ִ�.
		int[] nums = new int[3];
		
		Integer[] nums3 = new Integer[3];
		
		//���� �迭�� �⺻ ������ type �� ���� �� �����Ƿ�, wrapper class �� ��ƾ� �Ѵ�.
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(10);
	}
}
