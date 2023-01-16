package kr.tpc;

public class MemberVO {
	// private���� ��ü�� ���¸� ��ȣ�Ѵ� -> ��������
	private String name;
	private int age;
	private String tel;
	private String addr;

	// ����Ʈ �����ڸ� ��������� �����
	public MemberVO() {

	}

	// �����ε� �����ڸ� ����� �����ϰ� �ʱ�ȭ�Ѵ�.
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}



	// private���� ������� ��������� �����ϱ� ���� setter, getter method �����
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

	// ��ü�� ������ �ִ� �� ��ü�� ����ϱ� ���� toString()�� �������Ѵ�.
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
}
