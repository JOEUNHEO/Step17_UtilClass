package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type �� ���� �� �ִ� ArrayList ��ü ����
		ArrayList<String> msgs = new ArrayList<String>();//���� �迭 ��ü
		msgs.add("�ϳ�");
		msgs.add("�ο�");
		msgs.add("����");
		// int type �� ���� �� �ִ� ArrayList ��ü ����
		// �⺻ ������ type(Ŭ������ �ƴ�) �� ���� �� �����Ƿ� ��ü�� type ���� ��ƾ� �Ѵ�.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
	}
}
