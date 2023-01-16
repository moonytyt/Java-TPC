import java.util.ArrayList;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();// <BookDTO>는 BookDTO만 받는다
		list.add(new BookDTO("자바1", 15000, "인프런", 800));
		list.add(new BookDTO("자바2", 16000, "인프런", 800));
		list.add(new BookDTO("자바3", 17000, "인프런", 800));
		for (int i = 0; i < list.size(); i++) {
			//Object o = list.get(i);
			BookDTO vo = list.get(i);
			System.out.println(vo.title + " " + vo.price + " " + vo.company + " " + vo.page);
		}
	}
}
