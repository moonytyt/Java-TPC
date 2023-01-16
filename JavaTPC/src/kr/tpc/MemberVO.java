package kr.tpc;

public class MemberVO {
	// private으로 객체의 상태를 보호한다 -> 정보은닉
	private String name;
	private int age;
	private String tel;
	private String addr;

	// 디폴트 생성자를 명시적으로 만든다
	public MemberVO() {

	}

	// 오버로딩 생성자를 만들어 적절하게 초기화한다.
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}



	// private으로 만들어진 멤버변수를 접근하기 위해 setter, getter method 만든다
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 객체가 가지고 있는 값 전체를 출력하기 위한 toString()을 재정의한다.
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}
