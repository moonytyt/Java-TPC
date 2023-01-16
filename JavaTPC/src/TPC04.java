public class TPC04 {
	public static void main(String[] args) {
		// 4. 데이터를 이동하라(변수 VS 배열)
		// 변수
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c=? 메서드 처리 -> hap()
		hap(a, b, c);

		// 배열
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		hap1(arr);
	}

	public static void hap(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public static void hap1(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
