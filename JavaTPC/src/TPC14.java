import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO();
		m.setName("È«±æµ¿");
		m.setAge(20);
		m.setTel("010-1111-1111");
		m.setAddr("¼­¿ï");
		 
		System.out.println(m.getName()+", "+m.getAge()+", "+m.getTel()+", "+m.getAddr());
	}
	
}
