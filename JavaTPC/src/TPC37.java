import java.util.ArrayList;

import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
	public static void main(String[] args) {

		ArrayList arr = new ArrayList(5); // ArrayList�� ���̿� ������ ����
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new A());
		arr.add(new A());
		arr.add(new A());
		
		
		for(int i = 0 ;i<arr.size();i++) {
			Object o = arr.get(i);
			if( o instanceof A) {
				((A)o).go();
			}else {
				((B)o).go();
			}
			
		}
	}
}
