import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("③望翕", 20, "010-1111-1111", "憮選");

		System.out.println(m.toString());
		
		MemberVO m1 = new MemberVO();
		m1.setName("�垮瘚�");
		m1.setAge(20);
		m1.setTel("010-1111-1111");
		m1.setAddr("憮選");
		
		System.out.println(m1.toString());
	}
}
