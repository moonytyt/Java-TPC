import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// å -> class(BookDTO)->��ü->�ν��Ͻ�
		String title = "������";
		int price = 25000;
		String company = "������";
		int page = 890;

		BookDTO dto; // dto(Object: ��ü)
		dto = new BookDTO(title, price, company, page); // dto(Instance: �ν��Ͻ�)
		bookPrint(dto);
	}

	public static void bookPrint(BookDTO dto) { // class�� �ٱ��� ������ ��
		System.out.println(dto.title + ", " + dto.price + ", " + dto.company + ", " + dto.page);
	}
}
