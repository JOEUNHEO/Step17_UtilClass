package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass06 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "�豸��";
		names[1] = "�ذ�";
		names[2] = "������";
		
		// 1�� �ε����� ������ �����ؼ� ������ ���
		String a = names[1];
		// �迭�� ���� ����
		int length = names.length; // length ��� �ʵ� ����
		// 2 ���� ����?
		names[2] = null; // ������ ������ ���� ������ ����
		
		List<String> names2 = new ArrayList<String>();
		names2.add("�ֵ���");
		names2.add("�ذ�");
		names2.add("������");
		
		// 1�� �ε����� ������ �����ؼ� ������ ���
		String b = names2.get(1);
		// ���� �迭�� ���� ���� ����
		int size = names2.size(); // �޼ҵ�� ���� �ޱ�
		// 2 ���� ����
		names2.remove(2);
		
		//�Ʒ��� �߰��� printNames() �޼ҵ带 ȣ���� ������.
		printNames(names);
		
		//�Ʒ��� �߰��� printFriends() �޼ҵ带 ȣ���� ������.
		printFriends(names2);
				
	}
	// String[] type �� ���ڷ� ���� �޴� static ��� �޼ҵ�
	// �� ����� ������
	public static void printNames(String[] arg) {
		//�ݺ��� ���鼭 �迭�� �ִ� ��� ���ڿ���
		//����ϴ� �ڵ带 �ۼ��� ������.
		for(String tmp: arg) {
			System.out.println(tmp);
		}
	}
	
	/* List<String> type �� ���ڷ� ���� �޴� static ��� �޼ҵ�
	 * �� ����� ������.
	 */
	public static void printFriends(List<String> arg) {
		//�ݺ��� ���鼭 �迭�� �ִ� ��� ���ڿ���
		//����ϴ� �ڵ带 �ۼ��� ������.
		for(String tmp: arg) {
			System.out.println(tmp);
		}
	}
}
