import java.util.ArrayList;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();// <BookDTO>�� BookDTO�� �޴´�
		list.add(new BookDTO("�ڹ�1", 15000, "������", 800));
		list.add(new BookDTO("�ڹ�2", 16000, "������", 800));
		list.add(new BookDTO("�ڹ�3", 17000, "������", 800));
		for (int i = 0; i < list.size(); i++) {
			//Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + " " + vo.price + " " + vo.company + " " + vo.page);
		}
	}
}
