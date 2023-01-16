import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		// 책 1권을 저장하기위해 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title = "자바1";
		b.price = 10000;
		b.company = "a출판사";
		b.page = 531;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
	
		BookVO b1 = new BookVO();
		b1.title = "자바2";
		b1.price = 12000;
		b1.company = "b출판사";
		b1.page = 532;
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.company);
		System.out.println(b1.page);
		
	}
}
