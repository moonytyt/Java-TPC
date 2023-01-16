import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		// 1. Java���� �������ִ� class��
		// ���ڿ�(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // apple

		// 2. ���� ���� ����ϴ� class�� DTO/VO, DAO , Utility
		MyUtil my = new MyUtil();
		int v = my.hap();
		System.out.println(v);

		// 3. �ٸ� ȸ�翡�� ����� ���� class�� -> API
		// Gson -> json
		Gson g = new Gson();
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		String json = g.toJson(vo); 
		//{"title":"�ڹ�","price":13000,"company":"����","page":800} -> �޸𸮿� �ִ� ��ü�� String���·� �ٲ�
		System.out.println(json);
	}
}