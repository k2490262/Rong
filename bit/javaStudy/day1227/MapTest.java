import java.util.HashMap;

class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hello", 2);
		map.put("java", 1);
		
//		int n = map.get("hello"); // 2�� ǥ��
//		int n = map.get("korea"); // ���� ����, null�� int������ �ٲ��� ���ؼ�
		Integer n = map.get("korea"); // null�� ǥ��
		System.out.println(n);
	}
}
