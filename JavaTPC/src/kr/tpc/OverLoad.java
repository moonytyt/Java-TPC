package kr.tpc;

public class OverLoad {
	// ����(method)���θ� �̷���� ��ü
	public void hap(int a, int b) { // ���������� hap_int_int �� �Ǿ��ִ�.
		System.out.println(a + b);
	}

	public void hap(int a, float b) { // hap_int_float
		System.out.println(a + b);
	}

	public void hap(float a, int b) { // hap_float_int
		System.out.println(a + b);
	}

	public void hap(float a, float b) { // hap_float_float
		System.out.println(a + b);
	}

}
