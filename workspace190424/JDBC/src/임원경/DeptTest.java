package 임원경;

import java.util.List;

public class DeptTest {

	public static void main(String[] args) {

		DeptManager dptm = new DeptManager();
		List<Dept> list = dptm.getDepts();
		list.forEach(i->System.out.println(i));
		
		
	}

}
