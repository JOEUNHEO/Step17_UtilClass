package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  javascript ������ {} �� �����ϰ�
		 *  �����͸� �����ϴ� type
		 *   - HashMap<key generic, value generic>
		 */
		Map<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "�豸��");
		map.put("isMan", true);
		
		int a = (int)map.get("num");
		String b = (String)map.get("name");
		boolean c = (boolean)map.get("isMan");
	}
}
