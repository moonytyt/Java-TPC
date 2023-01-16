package kr.tpc;

// 책(Object)
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;

	// 디폴트 생성자메서드(생략) -> 생성자가 하나도 없을 시 자동으로 만들어짐
	// 그러나 생성자 메서드를 중복정의 한다면 디폴트 생성자 메서드를 반드시 추가해야한다.
	public BookVO() {
		// 초기화 작업
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}

	// 생성자 메서드의 중복정의(overloading) -> 매개변수이 갯수를 다르게 만듬
	public BookVO(String title, int price, String company, int page) {
		// 초기화 작업
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
