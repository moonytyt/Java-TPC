import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		// ������ -> ��ü ���� + �ʱ�ȭ -> �ߺ����� ����
		BookVO b1 = new BookVO();
		System.out.println(b1.title + " " + b1.price + " " + b1.company + " " + b1.page);

		BookVO b2 = new BookVO();
		System.out.println(b2.title + " " + b2.price + " " + b2.company + " " + b2.page);
		
		BookVO b3 = new BookVO("Python", 18000, "�븲", 920);
		System.out.println(b3.title + " " + b3.price + " " + b3.company + " " + b3.page);
	}
}
