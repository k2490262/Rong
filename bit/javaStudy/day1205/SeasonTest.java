import java.util.Scanner;

class SeasonTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.print("���� �Է��ϼ��� : ");
        month = sc.nextInt();

        String r = "";

        if(month >= 3 && month <= 5) {
            r = "��";
        } else if(month >= 6 && month <= 8) {
            r = "����";
        } else if(month >= 9 && month <= 11) {
            r = "����";
        } else if(month == 1 || month == 2 || month == 12) {
            r = "�ܿ�";
        } System.out.println(month + "���� " + r + "�Դϴ�.");
    }
}