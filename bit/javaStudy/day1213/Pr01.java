import java.util.Scanner;

class Pr02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int correctCnt = 0;
		int incorrectCnt = 0;
		String answer = "";
		String[] userAnswerList = new String[10];

		String[] question1 = {"���׸ǵ��� ã�Ƽ� ��Ŵ� �Ÿ���?", "�ֺ�Ÿ�", "�����Ÿ�", "�湫�ΰŸ�", "��ã��", "b"};
		String[] question2 = {"�ϴÿ��� �� ������?", "���̸�Ʈ", "���̿���", "���ֳ̾�", "�ȸ޳��׾�", "c"};
		String[] question3 = {"���� ������� �Ӹ�ī�� ���� ��� ���ϸ�?", "�Ұ�", "���Ұ�", "���Ѵ�", "0", "d"};
		String[] question4 = {"���� ���� �Ż簡 �ڱ� �Ұ��ϴ� ����?", "�Ż�����", "�Ż�����", "�Ż��Ӵ�", "�Ż絵", "c"};
		String[] question5 = {"�Ųٷ� �Ŵ޸� ���� õ�� ��ȣ(õ ���� ���� ������ ��)�� �����ΰ�?", "��ǰ�", "63����", "����", "û�ʹ�", "c"};
		String[] question6 = {"��� ���µ� ��� �ִٰ� �ϴ� ����?", "���� �Դ�", "���� ����", "�޿� �谨", "���� ����", "b"};
		String[] question7 = {"���󿡼� ���� ���� �ڴ� ������?", "�ɼ���", "�䳢�ҳ�", "������", "�̹���", "d"};
		String[] question8 = {"������ ������ â���� �������� ���� ���� �־���.\n�̷� �̾߱⸦ ����� �ұ�?", "�ų��� �̾߱�", "Ȳ���� �̾߱�", "������ �̾߱�", "������ �̾߱�", "a"};
		String[] question9 = {"����� �����԰� ���� ���� ���� ����?", "�� ���� ��", "ö �� ��", "���� ���� ��", "���� �� ��", "b"};
		String[] question10 = {"���� ��������� ����� �� ����?", "�̱ۺ���", "�̱��̱�", "�αۺα�", "��۹��", "c"};
		String[] answerList = {"b", "c", "d", "c", "c", "b", "d", "a", "b", "c"};
		String[] str = {};

		for(int i = 0; i < 10; i++){
			switch(i){
				case 0:
					str = question1;
					break;
				case 1:
					str = question2;
					break;
				case 2:
					str = question3;
					break;
				case 3:
					str = question4;
					break;
				case 4:
					str = question5;
					break;
				case 5:
					str = question6;
					break;
				case 6:
					str = question7;
					break;
				case 7:
					str = question8;
					break;
				case 8:
					str = question9;
					break;
				case 9:
					str = question10;
					break;
			}
			System.out.println("(" + (i + 1) + ") ���� : " + str[0]);
			for(int j = 1; j < str.length - 1; j++){
				System.out.println("(" + (char)(65 + j - 1) + ")" + str[j]);
			}

			while(true){
				System.out.print("�� : ");
				answer = sc.next();

				if (!answer.equals("a") && !answer.equals("b") && !answer.equals("c") && !answer.equals("d")){
					System.out.println("a,b,c,d �� �Է��ϼ���");
					continue;
				}
				break;
			}
			
			userAnswerList[i] = answer;
			
		}
//		for(String strr : userAnswerList)
//			System.out.println(strr);

		int correctAnswerCnt = correctAnswers(answerList, userAnswerList);
		int incorrectAnswerCnt = incorrectAnswers(answerList, userAnswerList);
		boolean isPassed = isPassed(correctAnswerCnt);

		System.out.println("���� Ƚ�� : " + correctAnswerCnt);
		System.out.println("���� Ƚ�� : " + incorrectAnswerCnt);
		System.out.println((isPassed) ? "����Դϴ�" : "������� ���߽��ϴ�");
	}
	//�л��� ���迡 ����ߴ��� �Ǵ�
	public static boolean isPassed(int correctAnswers){
		//���� Ƚ���� 7�̻��̸� ���
		if(correctAnswers >= 7){
			return true;
		}
		return false;
	}
	//�л��� ���� Ƚ�� �Ǵ��Ͽ� ī��Ʈ
	public static int correctAnswers(String[] answerList, String[] userAnswerList){
		int cnt = 0;
		for(int i = 0; i < answerList.length; i++){
			if(answerList[i].equals(userAnswerList[i])){
				cnt++;
			}
		}
		return cnt;
	}
	//�л��� ���� Ƚ�� �Ǵ��Ͽ� ī��Ʈ
	public static int incorrectAnswers(String[] answerList, String[] userAnswerList){
		int cnt = 0;
		for(int i = 0; i < answerList.length; i++){
			if(!answerList[i].equals(userAnswerList[i])){
				cnt++;
			}
		}
		return cnt;
	}
}
