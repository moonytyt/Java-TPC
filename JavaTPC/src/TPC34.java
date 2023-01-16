import kr.tpc.BookVO;

// import java.lang.*;
public class TPC34 {
	public static void main(String[] args) {
		// String
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);// apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		
		String str1 = new String("APPLE");
		String str2 = str1;
		System.out.println(str1 == str2);
		System.out.println(str2);
		
		BookVO b1 = new BookVO("자바", 1000, "회사", 800);
		BookVO b2 = b1;
		b1.title="파이썬";
		System.out.println(b2.title);
	}
}