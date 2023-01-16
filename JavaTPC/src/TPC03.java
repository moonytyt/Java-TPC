import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. PDV VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a; // 변수선언

		// 책 1권을 저장하기위한 변수를 선언하시오.
		Book b; // b는 데이터를 1개만 저장할 수 있다
		b = new Book(); // 메모리 어딘가에 객체 생성, b에는 메모리의 번지수를 할당
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.company);
		System.out.println(b.page);
		
		System.out.println();
		
		PersonVO p;
		p = new PersonVO();
		p.name="손흥민";
		p.age=30;
		p.weight=72.5f;
		p.height=185.5f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
	}
}