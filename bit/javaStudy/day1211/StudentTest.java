class StudentTest {
	public static void main(String[] args) {
		String name[] = {"���ξ�", "�ֿ���", "���ַ�",
						"�ֺ���", "������", "�̿���", "�̼���"};
		int age[] = {29, 28, 32, 29, 25, 31, 28};

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "   " + age[i]);
		}

		// ���̰� ���� ������ �����մϴ�.
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + age[i]);
			if (i = 0; i < age.length; i++) {
				if (int j = i + 1; j < age.length; j++) {
					int tmp = age[i];
					age[i] = age[j];
					age[j] = age[i];
				}
			}
		}
	}
}
