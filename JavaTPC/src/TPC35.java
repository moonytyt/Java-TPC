public class TPC35 {
	public static void main(String[] args) {
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");

		// NO
		if (str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		// YES
		if (str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		// YES
		String str3 = "APPLE";
		String str4 = "APPLE";
		if (str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		// YES
		if (str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		str1 = "APPLE";
		System.out.println(str1 == str4);

	}
}
