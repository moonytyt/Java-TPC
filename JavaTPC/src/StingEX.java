import kr.tpc.BookVO;

public class StingEX {
	public static void main(String[] args) {
		BookVO b1 = new BookVO("�ڹ�1", 10000, "Ƽ���丮", 800);
		BookVO b2 = b1;
		b1.title="�ڹ�2";
		System.out.println(b2.title);
		
		String str1 = new String("APPLE");
		String str2 = str1;
		System.out.println(str1 == str2); // true
		System.out.println(str2); // APPLE

		str1 = "apple";
		System.out.println(str1 == str2);//false
		System.out.println(str2);// APPLE
		
		String str3 = "apple";
		System.out.println(str1== str3);//true
	}
}