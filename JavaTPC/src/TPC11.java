import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// å 1���� �����ϱ����� ��ü�� �����Ͻÿ�.
		BookVO b = new BookVO();
		b.title = "�ڹ�1";
		b.price = 10000;
		b.company = "a���ǻ�";
		b.page = 531;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
	
		BookVO b1 = new BookVO();
		b1.title = "�ڹ�2";
		b1.price = 12000;
		b1.company = "b���ǻ�";
		b1.page = 532;
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.company);
		System.out.println(b1.page);
		
	}
}
