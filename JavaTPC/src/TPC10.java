import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// int, float, char, boolean -> �⺻�ڷ���
		int a = 10;

		// å(BookDTO)�̶�� �ڷ����� class�� �����
		BookDTO b = new BookDTO(); // ��ü����
		b.title = "�ڹ�";
		b.price = 17000;
		b.company = "�Ѻ�";
		b.page = 540;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
	}
}