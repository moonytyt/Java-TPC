import kr.tpc.OverLoad;

public class TPC16 {
	public static void main(String[] args) {
		// int + int, int + float, float + float
		OverLoad ov = new OverLoad();
		ov.hap(1, 10); // ov.hap_int_int(1,10)
		ov.hap(72.5f, 50); // ov.hap_float_int(72.5f, 50)
		ov.hap(5.5f, 45.3f); // ov.hap_float_float(5.5f, 45.3f)
	}
}
