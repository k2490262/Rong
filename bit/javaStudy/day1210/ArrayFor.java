class ArrayFor {
	public static void main(String[] args) {
	int age[] = {31, 28, 25, 29, 32, 28, 29};
	String name[] = {"�̿���", "�̼���", "������", "�ֺ���", "���ַ�",
					"�ֿ���", "���ξ�"};

		for (int i = 0 ; i < age.length; i++) {
			System.out.println(age[i]);
		}
		for (int value : age) {
			System.out.println(value);
		}
		for (String str : name)	{
			System.out.println(str);
		}
	}
}