class StudentTest02 {
	public static void main(String[] args) {
		String name[] = {"���ξ�", "�ֿ���", "���ַ�",
						"�ֺ���", "������", "�̿���", "�̼���"};
		int age[] = {29, 28, 32, 29, 25, 31, 28};

		// ���̰� ���� ������ �����մϴ�.
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] > age[j]) {
					int tmp = age[i];
					age[i] = age[j];
					age[j] = tmp;

					String tmp1 = name[i];
					name[i] = name[j];
					name[j] = tmp1;
				}
			}
		}
		System.out.println("���̰� � ������ �̸��� ���̴�");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + "\t" + age[i]);
		}
	}
}
