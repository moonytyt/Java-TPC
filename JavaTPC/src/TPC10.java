import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// int, float, char, boolean -> 기본자료형
		int a = 10;

		// 책(BookDTO)이라는 자료형을 class로 만든다
		BookDTO b = new BookDTO(); // 객체생성
		b.title = "자바";
		b.price = 17000;
		b.company = "한빛";
		b.page = 540;

		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
	}
}