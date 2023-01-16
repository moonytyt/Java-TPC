package kr.tpc;

public class OverLoad {
	// 동작(method)으로만 이루어진 객체
	public void hap(int a, int b) { // 내부적으로 hap_int_int 로 되어있다.
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
