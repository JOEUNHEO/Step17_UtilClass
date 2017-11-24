package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
 *  [ HashSet ]
 *  
 *   - ������ ����
 *   - �ߺ��� ������� �ʴ´�.
 *   - ������ �������� �����͸� ���� �ϰ� ���� �� ����Ѵ�.
 */
public class MainClass11 {
	public static void main(String[] args) {
		//HashSet ��ü �����ؼ� �������� ������ ���
		Set<Integer> lottoNums = new HashSet<Integer>();
		
		Random ran = new Random();
		
		while(true) {
			//1 ~ 45 ������ ������ ������ ����.
			int num = ran.nextInt(45)+1;
			//Set �� ����
			lottoNums.add(num); //Integer �� �ڵ� ���ε�!
			//Set �� 6 ���� ����Ǹ� �ݺ��� Ż��
			if(lottoNums.size() == 6) {
				break; //�ݺ��� �� ���� ������
			}
			
		}
		
		//�ݺ��� ��ü ���� �ޱ�
			Iterator<Integer> it = lottoNums.iterator();
			while(it.hasNext()) {
				int tmp = it.next();
				//�ֿܼ� ����� ����
				System.out.println(tmp);
			}
		
	}
}
