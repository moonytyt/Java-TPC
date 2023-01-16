package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;

	// 디폴트 생성자 메서드(생략되어 있음)
	public BookDTO() {
		// 객체를 생성하는 작업을 한다(기계어 코드) -> 메모리에 기억공간을 만드는 작업
	}

	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
}
